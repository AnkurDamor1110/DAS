package Binary_Search_Tree;


public class B5_Validate_BST {
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

    public static boolean isVaildBST(Node root,Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }
        if(max != null && root.data >= max.data){
            return false;
        }

        return isVaildBST(root.left, min, root) && isVaildBST(root.right, root, max);
    }
   
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,12};

        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        // inOrder(root);
      System.out.println(isVaildBST(root, null, null));
    }
}
