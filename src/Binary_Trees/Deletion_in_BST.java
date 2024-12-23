package Binary_Trees;

public class Deletion_in_BST {
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
        static public TreeNode insertNodes(TreeNode root, int val){
            if(root == null){
                return new TreeNode(val);
            }

            if(val < root.val){
                root.left = insertNodes(root.left, val);
            }else if(val > root.val){
                root.right = insertNodes(root.right, val);
            }

            return root;
        }

        static public TreeNode deleteElement(TreeNode root, int val){
            if(root == null){
                return null;
            }

            if(val > root.val){
                root.right = deleteElement(root.right, val);
            }else if(val < root.val){
                root.left = deleteElement(root.left, val);
            }else {

                //case 1 : node with only one children
                if(root.left == null){
                    return root.right;
                }else if(root.right == null){
                    return root.left;
                }

                //case 2 : node with only two or more children
                // find smallest in the right subtree
                TreeNode successor = findMin(root.right);

                root.val = successor.val;
                root.right = deleteElement(root.right, successor.val);
            }
            return root;
        }

        static public TreeNode findMin(TreeNode root){
            while(root.left != null){
                root = root.left;
            }
            return root;
        }

        static public TreeNode inOrder(TreeNode root){
            if(root == null){
                return root;
            }

            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);

            return root;
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        TreeNode root = null;

        root = tree.insertNodes(root, 20);
        root = tree.insertNodes(root, 1);
        root = tree.insertNodes(root, 9);
        root = tree.insertNodes(root, 10);
        root = tree.insertNodes(root, 6);
        root = tree.insertNodes(root, 2);
        root = tree.insertNodes(root, 23);
        root = tree.insertNodes(root, -1);

        root = tree.deleteElement(root, 10);  // true or false

        System.out.println("in order traversal after deletion");

        tree.inOrder(root);

    }
}
