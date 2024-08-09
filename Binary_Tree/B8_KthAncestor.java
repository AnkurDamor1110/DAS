package Binary_Tree;

public class B8_KthAncestor {
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

        public static int KthAncestor(Node root,int n,int k){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }

            int leftDist = KthAncestor(root.left, n, k);
            int  rightDist = KthAncestor(root.right, n, k);

            if(leftDist == -1 && rightDist == -1 ){
                return -1;
            } 
            int max = Math.max(leftDist, rightDist);

            if(max+1 == k){
                System.out.print(root.data + " ");
            }

            return max + 1 ;
        }

        
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        idx = -1; 
       Node root = BinaryTree.buildTree(nodes);
       
       System.out.println(BinaryTree.KthAncestor(root, 5, 2));
    }
}
