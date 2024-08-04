package DSA_Sheet.BinaryTrees;

import java.io.*;

public class maximum_depth_of_bt {
    static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        private int index = -1;

        public Node buildTree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static class Solution {
        public int maxDepth(Node root) {
            if (root == null) {
                return 0;
            }

            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);

            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    public static void main(String args[]) throws IOException {
        int nodes[] = {3, 2, 5, -1, -1, 6, -1, -1, 8, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        Solution solution = new Solution();
        int depth = solution.maxDepth(root);

        System.out.println("The maximum depth of the tree is: " + depth);
    }
}
