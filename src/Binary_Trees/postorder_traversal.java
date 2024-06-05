package Binary_Trees;

public class postorder_traversal {
    static class Node {
        int data;
        postorder_traversal.Node right;
        postorder_traversal.Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree {
        static int index = -1;

        private static postorder_traversal.Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            postorder_traversal.Node newNode = new postorder_traversal.Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        private void postOrder(postorder_traversal.Node root) {     //Time complexity : O(n)
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        postorder_traversal.BinaryTree tree = new postorder_traversal.BinaryTree();
        postorder_traversal.Node root = tree.buildtree(nodes);
        tree.postOrder(root);
    }
}
