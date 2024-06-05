package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class levelOrder_traversal {
    static class Node {
        int data;
        levelOrder_traversal.Node right;
        levelOrder_traversal.Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        private static levelOrder_traversal.Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            levelOrder_traversal.Node newNode = new levelOrder_traversal.Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        public void levelOrder(Node root) {
            if(root == null){
                return ;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()){
                Node currNode = q.remove();
                if(currNode == null){
                    System.out.println();
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }else{
                    System.out.print(currNode.data+" ");
                    if(currNode.left != null){
                        q.add(currNode.left);
                    }
                    if(currNode.right != null){
                        q.add(currNode.right);
                    }
                }
            }
        }
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        levelOrder_traversal.BinaryTree tree = new levelOrder_traversal.BinaryTree();
        levelOrder_traversal.Node root = tree.buildtree(nodes);
        tree.levelOrder(root);
    }

}
