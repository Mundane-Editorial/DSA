package Binary_Trees;

public class inorder_traversal {
    static class Node {
        int data;
        inorder_traversal.Node right;
        inorder_traversal.Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        private static inorder_traversal.Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            inorder_traversal.Node newNode = new inorder_traversal.Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        private void inOrder(inorder_traversal.Node root) {     //Time complexity : O(n)
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildtree(nodes);
        tree.inOrder(root);
    }
}
