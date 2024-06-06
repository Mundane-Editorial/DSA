package Binary_Trees;

public class invert_binary_tree {
    static class Node {
        int data;
        invert_binary_tree.Node right;
        invert_binary_tree.Node left;

        Node(int data) {
            this.data = data;
            this.right = null;
            this.left = null;
        }
    }

    static class BinaryTree{
        static int index = -1;

        private static invert_binary_tree.Node buildtree(int[] nodes) {
            index++;
            if (index >= nodes.length || nodes[index] == -1) {
                return null;
            }

            invert_binary_tree.Node newNode = new invert_binary_tree.Node(nodes[index]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);

            return newNode;
        }

        private invert_binary_tree.Node invertTree(invert_binary_tree.Node root) {
            invert(root);
            return root;
        }

        private static invert_binary_tree.Node invert(invert_binary_tree.Node root){
            if(root == null){
                return null;
            }

            invert_binary_tree.Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invert(root.left);
            invert(root.right);

            return root;
        }
    }

    public static void main(String args[]){
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        invert_binary_tree.BinaryTree tree = new invert_binary_tree.BinaryTree();
        invert_binary_tree.Node root = tree.buildtree(nodes);
        System.out.println(tree.invertTree(root));
    }
}
