package Binary_Tree;



public class B2_BinarayTree {
    // crate Node 
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
        static int idx = -1;

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

         // Tree Height --> O(n)
         public static int treeHeight(Node root){
            if(root == null){
                return 0;
            }

            int lh = treeHeight(root.left);
            int rh = treeHeight(root.right);

            return Math.max(lh, rh)+1;
        }

        public static int diameterTree_Approch1(Node root){
            if(root == null){
                return 0;
            }

            int leftDiam = diameterTree_Approch1(root.left);
            int leftHt = treeHeight(root.left);
            int rightDiam = diameterTree_Approch1(root.right);
            int rightHt = treeHeight(root.right);

            int selfDiam = leftHt + rightHt + 1;

            return Math.max(selfDiam, Math.max(rightDiam, leftDiam));
        }

        //diameterTree Approch- 2 with Info calss 
        // Time : O(n)
        
        static class Info{
            int diam;
            int ht;

            Info(int d,int h){
                this.diam = d;
                this.ht = h;
            }
        }
        public static Info diameterTree_Approch2(Node root){

            if(root == null){
                return new Info(0, 0);
            }

            Info leftInfo = diameterTree_Approch2(root.left);
            Info rightInfo = diameterTree_Approch2(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) +1 ;

            return new Info(diam,ht);
        }
    }


    public static void main(String[] args) {
         int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);
        System.out.println(BinaryTree.diameterTree_Approch1(root));
        System.out.println(BinaryTree.diameterTree_Approch2(root).diam);
    }
}
