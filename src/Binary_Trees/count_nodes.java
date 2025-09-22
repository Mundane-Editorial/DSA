package Binary_Trees;

import java.util.LinkedList;
import java.util.Queue;

public class count_nodes {
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static public class Tree{
        public static int idx = -1;
        public static Node buildTree(int[] nums){
            idx++;

            if(nums[idx] == -1){
                return null;
            }

            Node newNode = new Node(nums[idx]);
            newNode.left = buildTree(nums);
            newNode.right = buildTree(nums);

            return newNode;
        }

        public static int countNodes(Node root){
//            int count = 0;
            if(root == null){
                return 0;
            }

            return 1 + countNodes(root.left) + countNodes(root.right);
        }


        public static int sumNodes(Node root) {
            if(root == null){
                return 0;
            }

            return root.val + sumNodes(root.left) + sumNodes(root.right);
        }

        public static int height(Node root) {
            if(root == null){
                return 0;
            }

            int leftheight = height(root.left);
            int rightheight = height(root.right);

            return Math.max(leftheight, rightheight) + 1;
        }

        public static void leafNodes(Node root){
            if(root == null){
                return;
            }

            if(root.left == null && root.right == null){
                System.out.print(root.val + " ");
            }

            leafNodes(root.left);
            leafNodes(root.right);
        }

        public int diameter(Node root){
            if(root == null){
                return 0;
            }

            int leftDia = diameter(root.left);
            int rightDia = diameter(root.right);
            int diameter = height(root.left) + height(root.right) + 1;

            return Math.max(diameter, Math.max(leftDia, rightDia));   // takes O(n*n) time complexity
        }

        public static int sumAtLevel(Node root, int level){
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
            q.offer(null);
            int k = 1;
            int sum = 0;

            while(!q.isEmpty()){
                Node currNode = q.poll();
                if(currNode == null){
                    if(k == level){
                        return sum;
                    }

                    if(!q.isEmpty()){
                        q.offer(null);
                    }

                    k++;
                }else{
                    if(k == level){
                        sum += currNode.val;
                    }
                    if(currNode.left != null){
                        q.offer(currNode.left);
                    }
                    if(currNode.right != null){
                        q.offer(currNode.right);
                    }
                }

            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        Tree tree = new Tree();
        Node root = tree.buildTree(nodes);

        System.out.println("total number of nodes = "+ tree.countNodes(root));
        System.out.println("Sum of all nodes = "+ tree.sumNodes(root));
        System.out.println("height of binary tree = "+ tree.height(root));
        System.out.println("Print all leaf nodes = ");
        tree.leafNodes(root);
        System.out.println(" \nDiameter of binary tree = " + tree.diameter(root));
        System.out.println("Sum of all nodes at 2nd level = " + tree.sumAtLevel(root, 2));

    }
}
