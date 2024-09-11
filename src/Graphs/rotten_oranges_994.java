package Graphs;

import java.util.*;

public class rotten_oranges_994 {
    public static void main(String[] args) {
        int[][] grid = {
                {2, 1, 1},
                {1, 1, 0},
                {0, 1, 1}
        };

        System.out.println("Time taken: " + orangesRotting(grid) + " minutes");
    }

    private static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        Queue<int[]> q = new LinkedList<>();
        int freshCount = 0;

        // Step 1: Add all rotten oranges to the queue and count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    freshCount++;
                } else if (grid[i][j] == 2) {
                    q.add(new int[]{i, j});
                }
            }
        }

        // If there are no fresh oranges, no time is needed
        if (freshCount == 0) {
            return 0;
        }

        int time = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};  // up, down, right, left

        // Step 2: Perform BFS to rot neighboring oranges
        while (!q.isEmpty()) {
            int size = q.size();
            boolean rottenThisTurn = false;

            // Process all rotten oranges at the current level
            for (int i = 0; i < size; i++) {
                int[] rottenLoc = q.poll();
                int r = rottenLoc[0];
                int c = rottenLoc[1];

                // Check all 4 possible directions
                for (int[] direction : directions) {
                    int nr = r + direction[0];
                    int nc = c + direction[1];

                    // Check for out of bounds and if it's a fresh orange
                    if (nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1) {
                        grid[nr][nc] = 2;  // Mark it as rotten
                        q.offer(new int[]{nr, nc});
                        freshCount--;
                        rottenThisTurn = true;
                    }
                }
            }

            // Only increase time if any fresh orange turned rotten in this round
            if (rottenThisTurn) {
                time++;
            }
        }

        // If there are still fresh oranges left, return -1
        return freshCount == 0 ? time : -1;
    }
}

/*

q.add() vs q.offer() and q.remove() vs q.poll() ;

In Java, both add() and offer(), as well as remove() and poll(), are used with Queue interfaces like LinkedList,
PriorityQueue, etc. Here's the difference between them:

1. add() vs offer()
Both methods are used to insert an element into a queue.

add(E e):
Throws an exception (IllegalStateException) if the queue is full (in a bounded queue).
Suitable when you are confident the insertion will not fail.
offer(E e):
Returns true if the element is added successfully; otherwise, returns false.
Does not throw an exception if the queue is full; instead, it handles failure gracefully.
It's preferable when you want to avoid exceptions and handle insertion failures more safely.
2. remove() vs poll()
Both methods are used to retrieve and remove the head of the queue.

remove():

Removes and returns the head of the queue.
Throws a NoSuchElementException if the queue is empty.
Use this when you are certain the queue is not empty and want strict exception handling.
poll():

Removes and returns the head of the queue, or returns null if the queue is empty.
It's more tolerant since it returns null instead of throwing an exception when the queue is empty.

* */