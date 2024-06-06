package Binary_Trees;

import java.util.ArrayList;

public class count_complete_tree_nodes {
    static class Node {
        int data;
        count_complete_tree_nodes.Node right;
        count_complete_tree_nodes.Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree{
        static int index = -1;

        private static count_complete_tree_nodes.Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            count_complete_tree_nodes.Node newNode = new count_complete_tree_nodes.Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        public int countNodes(count_complete_tree_nodes.Node root) {
            ArrayList<Integer> list = new ArrayList<>();
            numberofNodes(root,list);
            return list.size();
        }

        public static void  numberofNodes( count_complete_tree_nodes.Node root, ArrayList<Integer> list){
            if(root == null){
                return;
            }

            numberofNodes(root.left, list);
            list.add(root.data);
            numberofNodes(root.right, list);
        }
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        count_complete_tree_nodes.BinaryTree tree = new count_complete_tree_nodes.BinaryTree();
        count_complete_tree_nodes.Node root = tree.buildtree(nodes);
        System.out.println(tree.countNodes(root));
    }
}
