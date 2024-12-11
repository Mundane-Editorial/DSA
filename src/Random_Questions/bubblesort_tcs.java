package Random_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class bubblesort_tcs {

    // Function to perform bubble sort and count swaps
    public static int bubbleSort(int[] arr, boolean asc) {
        int swapCount = 0;
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if ((asc && arr[j] > arr[j + 1]) || (!asc && arr[j] < arr[j + 1])) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapCount++;
                    swapped = true;
                }
            }
            // If no two elements were swapped, the array is already sorted
            if (!swapped) {
                break;
            }
        }
        return swapCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of elements
        int N = sc.nextInt();

        // Input array elements
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Make copies of the array
        int[] ascArr = Arrays.copyOf(arr, N);
        int[] dscArr = Arrays.copyOf(arr, N);

        // Get the swap counts for both ascending and descending order
        int ascSwaps = bubbleSort(ascArr, true);
        int dscSwaps = bubbleSort(dscArr, false);

        // Output the minimum number of swaps
        System.out.println(Math.min(ascSwaps, dscSwaps));

        // Close the scanner
        sc.close();
    }
}
