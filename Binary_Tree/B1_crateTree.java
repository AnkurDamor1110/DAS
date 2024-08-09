package Binary_Tree;

import java.util.LinkedList;
import java.util.Queue;

public class B1_crateTree {
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

    // Binary tree
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

        // PreOrder Trversals --> O(n)
        public static void preOrder(Node root){
            if(root == null){
                // System.out.print("-1 ");
                return;
            }
            System.out.print(root.data +" ");
            preOrder(root.left);
            preOrder(root.right);
        }

        // InOrder Trversals --> O(n)
        public static void inOrder(Node root){
            if(root == null){
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }

        // PostOrder Trversals --> O(n)
        public static void postOrder(Node root){
            if(root == null){
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }

        // Lavel Order Trversals --> O(n)
        public static void lavelOrder(Node root){
            if(root == null){
                return;
            }
           Queue<Node> q = new LinkedList<>();
           q.add(root);
           q.add(null); // when null come print new Line 

           while (!q.isEmpty()){
                Node cruuNode = q.remove();
                if(cruuNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(cruuNode.data + " ");
                    if(cruuNode.left != null){
                        q.add(cruuNode.left);
                    }

                    if(cruuNode.right != null){
                        q.add(cruuNode.right);
                    }
                }
           }
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

        // Count of Nodes in tree --> O(n)
        public static int countNode(Node root){
            if(root == null){
                return 0;
            }

            int lcount = countNode(root.left);
            int rcount = countNode(root.right);

            return lcount + rcount + 1 ;
        }

        // Sum of Nodes --> O(n)
        public static int sumOfNodes(Node root){
            if(root == null){
                return 0;
            }
            int lSum = sumOfNodes(root.left);
            int rSum = sumOfNodes(root.right);

            return lSum + rSum + root.data;
        }
        
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        // BinaryTree tree = new BinaryTree();
        Node root = BinaryTree.buildTree(nodes);

        // BinaryTree.lavelOrder(root);

        System.out.println(BinaryTree.sumOfNodes(root));
    }
}
