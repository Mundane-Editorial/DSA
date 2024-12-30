package Binary_Trees;

public class Lowest_common_ancestor_BST {
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

            if(val < root.val){
                root.left = insert(root.left, val);
            }else if(val > root.val){
                root.right = insert(root.right, val);
            }

            return root;
        }

        public TreeNode findLCA(TreeNode root, TreeNode p, TreeNode q){
            if(root == null || root == p || root == q){
                return root;
            }

            TreeNode leftLCA = findLCA(root.left, p, q);
            TreeNode rightLCA = findLCA(root.right, p, q);

            if(leftLCA != null && rightLCA != null){
                return root;
            }

            return (leftLCA != null) ? leftLCA : rightLCA;
        }

        public TreeNode findNode(TreeNode root, int val) {
            if (root == null) {
                return null;
            }

            if (val == root.val) {
                return root;
            }

            if (val < root.val) {
                return findNode(root.left, val);
            } else {
                return findNode(root.right, val);
            }
        }

    }

    public static void main(String[] args) {
        BST tree = new BST();
        TreeNode root = null;

        root = tree.insert(root, 1);
        root = tree.insert(root, 2);
        root = tree.insert(root, 3);
        root = tree.insert(root, 4);
        root = tree.insert(root, 5);
        root = tree.insert(root, 6);
        root = tree.insert(root, 7);
        root = tree.insert(root, 8);
        root = tree.insert(root, 9);
        root = tree.insert(root, 10);
        root = tree.insert(root, 11);
        root = tree.insert(root, 12);
        root = tree.insert(root, 13);
        root = tree.insert(root, 14);
        root = tree.insert(root, 15);

        TreeNode p = tree.findNode(root, 4);
        TreeNode q = tree.findNode(root, 6);

        if (p == null || q == null) {
            System.out.println("One or both nodes not found in the tree.");
            return;
        }

        TreeNode res = tree.findLCA(root, p, q);
        System.out.println("LCA of " + p.val + " & " + q.val + " is : " + res.val);
    }
}
