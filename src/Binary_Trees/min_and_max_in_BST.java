package Binary_Trees;

public class min_and_max_in_BST {
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.left = null;
            this.right = null;
            this.val = val;
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

        public int findmin(TreeNode root){
            if(root == null){
                return 0;
            }

            while(root.left != null){
                root = root.left;
            }

            return root.val;
        }

        public int findmax(TreeNode root){
            if(root == null){
                return 0;
            }

            while(root.right != null){
                root = root.right;
            }

            return root.val;
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

        System.out.println(tree.findmin(root));
        System.out.println(tree.findmax(root));
    }
}


/*
* time complexity : O(n) for unbalanced tree || O(log n) for balanced tree
*
* */