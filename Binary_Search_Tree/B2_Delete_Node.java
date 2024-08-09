package Binary_Search_Tree;

public class B2_Delete_Node {
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

    public static Node delete(Node root,int val){

        if(root.data < val){
            root.right = delete(root.right, val);
        } else if(root.data > val){
            root.left = delete(root.left, val);
        } else {
            //voila --> val find for delete 
            //Case:1 --> Leaf Nodes
            if(root.left == null && root.right == null){
                return null;
            }

            //Case:2 --> Single child

            if(root.left == null){
                return root.right;
            }

            if(root.right == null){
                return root.left;
            }

            //Case:3 -->Both children

            Node Is = findInorderSuccessor(root.right);
            root.data =Is.data;
            root.right = delete(root.right, Is.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left != null){
            root = root.left;
        }

        return root;
    }
    public static void main(String[] args) {
        int val[] = {8,5,3,1,4,6,10,11,12};

        Node root = null;
        for(int i=0;i<val.length;i++){
            root = insert(root, val[i]);
        }

        inOrder(root);
        delete(root, 11);
        System.out.println();
        inOrder(root);
        
    }
}
