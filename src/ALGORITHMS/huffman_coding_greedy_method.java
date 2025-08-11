package ALGORITHMS;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class huffman_coding_greedy_method {
    static class Node{
        int data;
        Node left, right;
        Node(int x){
            data = x;
            this.left = null;
            this.right = null;
        }
    }

    static ArrayList<String> huffmanCoding(String s, int[] freq){
        int n = freq.length;

        PriorityQueue<Node> minheap = new PriorityQueue<>((a,b) -> {if(a.data < b.data) {return -1; } return 1; });

        for(int i=0; i<n; i++){
            Node temp = new Node(freq[i]);
            minheap.add(temp);
        }

        while(minheap.size() >= 2){
            Node l = minheap.poll();
            Node r = minheap.poll();

            Node newNode = new Node( l.data + r.data );

            newNode.left = l;
            newNode.right = r;

            minheap.add(newNode);
        }

        Node root = minheap.poll();
        ArrayList<String> ans = new ArrayList<>();
        preOrder(root, ans, "");
        return ans;
    }

    private static void preOrder(Node root, ArrayList<String> ans, String curr) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            ans.add(curr);
            return;
        }
        preOrder(root.left, ans, curr + '0');
        preOrder(root.right, ans, curr + '1');
    }

    public static void main(String[] args) {
        String s = "abcde";
        int[] freq = {3,5,6,4,2};

        ArrayList<String> res = huffmanCoding(s, freq);
        System.out.println(res);
    }
}
