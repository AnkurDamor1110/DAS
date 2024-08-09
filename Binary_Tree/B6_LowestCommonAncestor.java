package Binary_Tree;

import java.util.ArrayList;

public class B6_LowestCommonAncestor {
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
        
        public static Node lca(Node root,int n1,int n2){
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root,n1,path1);
            getPath(root,n2,path2);

            int i=0;
            for(; i<path1.size() && i < path2.size(); i++){
                // System.out.println( 1 +" " +path1.get(i).data);
                // System.out.println(2 + " " +path2.get(i).data);
                if(path1.get(i) != path2.get(i)){
                    break;
                }
            }
            
            for(int j =0 ;j<path1.size();j++){
                System.out.print(  path1.get(j).data + " ");
            }
            System.out.println();
            for(int j =0 ;j<path2.size();j++){
                System.out.print( path2.get(j).data + " ");
            }
            System.out.println();
            Node lca = path1.get(i-1);

            return lca;
        }

        public static boolean getPath(Node root,int n, ArrayList<Node> path){

            if(root == null){
                return false;
            }
            path.add(root);

            if(root.data == n){
                return true;
            }

            boolean foundLeft = getPath(root.left, n, path);
            boolean foundRight = getPath(root.right, n, path);

            if(foundLeft || foundRight){
                return true;
            }

            path.remove(path.size() -1);
            return false;
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
    }
    public static void main(String[] args) {
        int nodes[]= {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        idx = -1; 
       Node root = BinaryTree.buildTree(nodes);

       System.out.println(BinaryTree.lca(root, 4, 6).data);
    }
}
