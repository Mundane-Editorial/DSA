package usthaan;

import java.util.LinkedList;
import java.util.Queue;

public class view_of_tree {
    static class Node{
        Node left ;
        Node right ;
        int val = 0;
        Node(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        public static Node createTree(int[] arr){
            idx++;
            if(arr[idx] == -1){
                return null;
            }

            Node newNode = new Node(arr[idx]);
            newNode.left = createTree(arr);
            newNode.right = createTree(arr);

            return newNode;
        }

        static void leftView(Node root){
            Queue<Node> q = new LinkedList<>();
            q.offer(root);
//            q.offer(null);

            while(!q.isEmpty()){
                int size = q.size();
                for(int i=0; i<size; i++){
                    Node curr = q.poll();

                    if(i == 0){
                        System.out.print(curr.val + " ");
                    }

                    if(curr.left != null) {
                        q.offer(curr.left);
                    }
                    if(curr.right != null){
                        q.offer(curr.right);
                    }
                }
            }
        }

        static void rightView(Node root){
            Queue<Node> q = new LinkedList<>();
            q.offer(root);

            while(!q.isEmpty()){
                int size = q.size();

                for(int i=0; i<size; i++){
                    Node curr = q.poll();

                    if(i == size - 1){
                        System.out.print(curr.val + " ");
                    }

                    if(curr.left != null){
                        q.offer(curr.left);
                    }
                    if(curr.right != null){
                        q.offer(curr.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.createTree(arr);
        System.out.println("-------- LEFT view -------------");
        tree.leftView(root);
        System.out.println(" \n -------- RIGHT view -------------");
        tree.rightView(root);
    }
}
