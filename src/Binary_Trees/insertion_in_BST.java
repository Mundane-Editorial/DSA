package Binary_Trees;

public class insertion_in_BST {
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

        // inorder traversal
        public void inOrderTraversal(TreeNode root){
            if(root == null){
                return;
            }

            inOrderTraversal(root.left);
            System.out.print(root.val + " ");
            inOrderTraversal(root.right);
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

        System.out.println("In-order traversal of the BST:");
        tree.inOrderTraversal(root);
    }
}


/*
time complexity :
worst case : O(n) for unbalanced tree
best case : O(log n) for balanced tree
 */