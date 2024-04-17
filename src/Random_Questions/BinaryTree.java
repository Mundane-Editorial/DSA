package Random_Questions;

// Node class representing a node in the binary tree
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}

// BinaryTree class representing the binary tree and traversal methods
public class BinaryTree {
    // Method to perform inorder traversal of the binary tree
    public void inorder(TreeNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.val + " ");
            inorder(root.right);
        }
    }

    // Method to perform preorder traversal of the binary tree
    public void preorder(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Method to perform postorder traversal of the binary tree
    public void postorder(TreeNode root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        // Creating a binary tree
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(6);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(7);
        root.left.right = new TreeNode(8);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(11);
        root.right.right.right = new TreeNode(12);

        BinaryTree tree = new BinaryTree();

        System.out.println("Inorder traversal:");
        tree.inorder(root);

        System.out.println("\nPreorder traversal:");
        tree.preorder(root);

        System.out.println("\nPostorder traversal:");
        tree.postorder(root);
    }
}
