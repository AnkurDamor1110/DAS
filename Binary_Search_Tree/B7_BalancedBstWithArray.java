package Binary_Search_Tree;



public class B7_BalancedBstWithArray {
    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }
    public static Node insert(Node root,int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            //left SubTree
            root.left = insert(root.left, val);
        } else{
            //right SubTree
            root.right = insert(root.right, val);
        }
        return root;

    }


    public static void inOrder(Node root){
        if(root == null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

   public static Node balanceBST(int arr[], int st , int end){
     
        if(st > end){
            return null;
        }

        int mid = (st + end )/2;
        Node root = new Node(arr[mid]);

        root.left = balanceBST(arr, st, mid - 1);
        root.right = balanceBST(arr, mid + 1, end);

        return root;
   }
   
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,12};

        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        // inOrd
        preOrder(root);
         root = balanceBST(val, 0, val.length-1);
        System.out.println();
        preOrder(root);
    }
}
