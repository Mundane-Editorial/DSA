package Binary_Trees;

import com.sun.source.tree.Tree;

public class searching_in_BST {
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
        public static TreeNode insert(TreeNode root, int val){
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

        public static boolean search(TreeNode root, int key, int depth){
            if(root == null){
                return false;
            }

            if(root.val == key){
                System.out.println("Found " + key + " at depth: " + depth);
                return true;
            }

            if(key > root.val){
                return search(root.right, key, depth + 1);
            }else if(key < root.val){
                return search(root.left, key, depth + 1);
            }

            return false;
        }

        public static void inOrderTraversal(TreeNode root){
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
        root = tree.insert(root, -8);
        root = tree.insert(root, 11);
        root = tree.insert(root, 19);
        root = tree.insert(root, -20);

        int key = 23;

        System.out.println("In-order traversal of the BST:");
        tree.inOrderTraversal(root);

        System.out.println("Does Tree Contains key = " + key + " ? " + tree.search(root, key, 0));
    }
}

/*
* Time COmplexity:
* best case : O(log n)
* worst case : O(n) unbalanced tree
* */