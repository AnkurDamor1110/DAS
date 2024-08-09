package Binary_Tree;

public class B7_MinDistanceBetweenNode {
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

        public static Node lca2(Node root, int n1,int n2){
            if(root == null || root.data == n1  || root.data == n2 ){
                return root;
            }

            Node leftLca = lca2(root.left, n1, n2);
            Node rightLca = lca2(root.right, n1, n2);

            // if right --> null return left Lca And left --> null return right Lca

            if(rightLca == null){
                return leftLca;
            }
            if(leftLca == null){
                return rightLca;
            }

            // if not any Null return root
            return root;
        }

        public static int minDist(Node root,int n1,int n2){
            Node lca = lca2(root, n1, n2);
            int dist1 = lcaDist(lca,n1);
            int dist2 = lcaDist(lca,n2);

            return dist1 + dist2 ;
        }

        public static int lcaDist(Node root,int n){
            if(root == null){
                return -1;
            }
            if(root.data == n){
                return 0;
            }

           int leftDist =  lcaDist(root.left, n);
           int rightDist = lcaDist(root.right, n);

           if(leftDist == -1 && rightDist == -1){
                return -1;
           }else if(leftDist == -1){
                return rightDist +1;
           }else { // rightDist == -1
                return leftDist +1;
           }
        }

    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        idx = -1; 
       Node root = BinaryTree.buildTree(nodes);
       System.out.println(BinaryTree.minDist(root, 4, 6));
    }
}
