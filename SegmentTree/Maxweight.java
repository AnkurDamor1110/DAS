package SegmentTree;

import java.util.Comparator;
import java.util.*;
public class Maxweight {
    static int tree[];
    public static void init(int arr[][]){
        int n = arr.length;
        tree = new int[4*n];
    }

    public static void bulidST(int arr[][],int i,int start,int end){
        if(start == end){
            tree[i] = arr[start][1];
            return;
        }

        int mid = (start + end) /2;
        bulidST(arr, 2*i+1, start, mid);
        bulidST(arr, 2*i+2, mid+1, end);

        tree[i] = Math.max(tree[2*i+1], tree[2*i+2]);

    }

    public static int findMaxUtil(int arr[][],int i,int si,int sj,int qi,int qj){
        if(qj < arr[si][0] || qi > arr[sj][0] ){
            return Integer.MIN_VALUE;
        } else if(arr[si][0] >= qi && arr[sj][0]  <= qj){
            return tree[i];
        }else {
            int mid = (si + sj) /2;
            int left = findMaxUtil(arr,2*i+1, si, mid, qi, qj);
            int right = findMaxUtil(arr,2*i+2, mid+1, sj, qi, qj);

            return Math.max(left,right);
        }
    }
    public static int findMax(int arr[][],int q[]){
        int n = arr.length;

        return findMaxUtil(arr,0, 0, n-1, q[0],  q[1]);
    }
    public static void main(String[] args) {
        int[][] arr = { { 1000, 300 }, // price , weight
						{ 1300, 400 },
						{ 1100, 200 },
						{ 1700, 500 },
						{ 2000, 600 } };
        
      
        Arrays.sort(arr,Comparator.comparingDouble(o -> o[0]));
        init(arr);
        bulidST(arr, 0, 0, arr.length-1);

        for(int i=0;i<tree.length;i++){
            System.out.print(tree[i] + " ");
        }
        System.out.println();
        int[][] queries = { { 1000, 1400 },
							{ 1700, 1900 },
							{ 0, 3000 } };

        for (int[] q : queries){
            System.out.println(findMax(arr, q));
        }

    }
}
