package Binary_Search_Tree;

import java.util.ArrayList;

public class B4_RootToLeaf {
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

    public static void pritntRoot2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);
        if(root.left == null && root.right == null){
            printPath(path);
        }
        pritntRoot2Leaf(root.left, path);
        pritntRoot2Leaf(root.right, path);

        path.remove(path.size() - 1);
    }

    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+ " --> ");
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,12};

        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }
        ArrayList<Integer> path = new ArrayList<>();
        // inOrder(root);
       pritntRoot2Leaf(root, path);
       System.out.println();
       printPath(path);
    }
}
