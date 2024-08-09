package Binary_Search_Tree;

public class B6_MirrorBST {
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

    public static Node mirorBST(Node root){
        if(root == null){
            return null;
        }
        Node leftMirror = mirorBST(root.left);
        Node rightMirror = mirorBST(root.right);

        root.left = rightMirror;
        root.right = leftMirror;

        return root;
    }
   
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,12};

        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        inOrder(root);
        root = mirorBST(root);
        System.out.println();
        inOrder(root);
    }
}
