package SegmentTree;

public class MaxST {
    static int tree[];

    public static void init(int n){
        tree = new int[4*n];
    }

    public static void buildST(int[] arr,int i,int start,int end){
        if(start == end){
            tree[i] = arr[start];
            return ;
        }

        int mid =(start + end) / 2;
        buildST(arr, 2*i+1, start, mid);
        buildST(arr, 2*i+2, mid+1, end);

        tree[i] = Math.max(tree[2*i+1],tree[2*i+2]);

        
    }
    public static int getMaxUtil(int i,int si,int sj,int qi,int qj){
        if(si > qj || sj < qi){
            return Integer.MIN_VALUE;
        } else if(si >= qi && sj <= qj){
            return tree[i];
        }else {
            int mid = (si+sj)/2;
            int left = getMaxUtil(2*i+1, si, mid, qi, qj);
            int right = getMaxUtil(2*i+2, mid+1, sj, qi, qj);

            return Math.max(left,right);
        }
    }
    public static int getMax(int[] arr,int qi,int qj){
        int n = arr.length;
        return getMaxUtil(0, 0, n-1, qi, qj);
    }

    public static void updatedUtil(int i,int idx,int si,int sj,int newVal){
        if(idx < si || idx > sj){
            return;
        }

        if(si == sj){
            tree[i] = newVal;
        }

        if(si != sj){
            tree[i] = Math.max(tree[i],newVal);
            int mid = (si +sj) / 2;
            updatedUtil(2*i+1, idx, si, mid, newVal);
            updatedUtil(2*i+2, idx, mid+1, sj, newVal);
        }
    }
    public static void updated(int[] arr,int idx,int newVal){
        int n = arr.length;
        arr[idx] = newVal;
        updatedUtil(0, idx, 0, n-1 , newVal);
    }

    public static void main(String[] args) {
        int[] arr = {6,8,-1,2,17,1,3,2,4};
        int n = arr.length;
        init(n);
        buildST(arr, 0, 0, n-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();

        System.out.println(getMax(arr, 2, 5));

        updated(arr, 2, 20);

        System.out.println(getMax(arr, 2, 5));
    }
}
