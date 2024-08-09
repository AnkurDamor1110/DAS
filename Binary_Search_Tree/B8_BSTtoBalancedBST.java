package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.Arrays;

public class B8_BSTtoBalancedBST {
    public static class Node {
    
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

        public static Node balanceBST(ArrayList<Integer> arr, int st , int end){
     
            if(st > end){
                return null;
            }
    
            int mid = (st + end )/2;
            Node root = new Node(arr.get(mid));
    
            root.left = balanceBST(arr, st, mid - 1);
            root.right = balanceBST(arr, mid + 1, end);
    
            return root;
       }

        public static void getInorder(Node root,ArrayList<Integer> inOrder){
        if(root == null){
            return;
        }
        getInorder(root.left, inOrder);
        inOrder.add(root.data);
        getInorder(root.right, inOrder);
    }
        public static Node bst2balance(Node root){
        //inoder Sequence 
        ArrayList<Integer> inOrder = new ArrayList<>();
        getInorder(root,inOrder);

        // sorted inorder --> blanced BST
        root = balanceBST(inOrder, 0, inOrder.size()-1);

        return root;
    }
    public static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(8,5,3,1,4,6,10,11,12));
       

        Node root = null;
        for(int i=0;i<arr.size();i++){
            root = insert(root,arr.get(i));
        }

        preOrder(root);
        root = bst2balance(root);
        System.out.println();
        preOrder(root);
    }
}
