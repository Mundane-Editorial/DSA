package Binary_Trees;

public class max_diameter_of_BST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BST {
        static private int maxdia = 0; // Class-level variable to track the maximum diameter

        static public TreeNode insert(TreeNode root, int val) {
            if (root == null) {
                return new TreeNode(val);
            }

            if (val < root.val) {
                root.left = insert(root.left, val);
            } else if (val > root.val) {
                root.right = insert(root.right, val);
            }

            return root;
        }

        static public int diameter(TreeNode root) {
            if (root == null) {
                return 0;
            }

            int left = diameter(root.left); // Height of left subtree
            int right = diameter(root.right); // Height of right subtree

            // Update the maximum diameter
            maxdia = Math.max(maxdia, left + right);

            return 1 + Math.max(left, right); // Return the height of the current subtree
        }

        static public int getMaxDiameter(TreeNode root) {
            maxdia = 0; // Reset the diameter before calculation
            diameter(root);
            return maxdia;
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        TreeNode root = null;

        root = tree.insert(root, 20);
        root = tree.insert(root, 1);
        root = tree.insert(root, 9);
        root = tree.insert(root, 10);
        root = tree.insert(root, 6);
        root = tree.insert(root, 2);
        root = tree.insert(root, 23);
        root = tree.insert(root, -1);

        System.out.println("Max diameter: " + BST.getMaxDiameter(root));
    }
}
