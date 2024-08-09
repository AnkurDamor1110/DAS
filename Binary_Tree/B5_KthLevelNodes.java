package Binary_Tree;

public class B5_KthLevelNodes {
    static int idx = -1;
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }

    static class BinaryTree{


        public static Node buildTree(int nodes[]){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);

            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void kLevel(Node root,int level, int k){
            if(root == null){
                return;
            }
            if(level == k){
                System.out.print(root.data +" ");
                return;
            }
            kLevel(root.left, level + 1, k);
            kLevel(root.right, level + 1, k);    
        }
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
         idx = -1; 
        Node root = BinaryTree.buildTree(nodes);
        int k =3;
        BinaryTree.kLevel(root, 1, k);
    }
}
