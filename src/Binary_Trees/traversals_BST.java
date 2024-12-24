package Binary_Trees;

public class traversals_BST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BST{
        public TreeNode insert(TreeNode root, int val){
            if(root == null){
                return new TreeNode(val);
            }

            if(val > root.val){
                root.right = insert(root.right, val);
            }else if(val < root.val){
                root.left = insert(root.left, val);
            }

            return root;
        }

        public void preorder(TreeNode root) {
            if(root == null){
                return;
            }

            System.out.print(root.val + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public void inorder(TreeNode root) {
            if(root == null){
                return;
            }

            preorder(root.left);
            System.out.print(root.val + " ");
            preorder(root.right);
        }

        public void postorder(TreeNode root) {
            if(root == null){
                return;
            }

            preorder(root.left);
            preorder(root.right);
            System.out.print(root.val + " ");
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        TreeNode root = null;

        root = tree.insert(root, 20);
        root = tree.insert(root, 23);
        root = tree.insert(root, -1);
        root = tree.insert(root, 6);
        root = tree.insert(root, 10);
        root = tree.insert(root, 2);
        root = tree.insert(root, 1);
        root = tree.insert(root, 9);

        System.out.println("preorder traversal ");
        tree.preorder(root);
        System.out.println(" \n inorder traversal ");
        tree.inorder(root);
        System.out.println(" \n postorder traversal ");
        tree.postorder(root);
    }
}
