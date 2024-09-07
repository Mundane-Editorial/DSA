package SAP_labs;

public class find_missing_number {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,13};
        System.out.println("missing no :: " + findmissing(arr));
    }

    private static int findmissing(int[] arr) {
        int l = arr.length;

        int expectedsum = 0;
        int totalsum = 0;
        for(int i=0; i<l; i++){
            expectedsum += i;
            totalsum += arr[i];
        }

        return totalsum - (expectedsum+1) ;
    }
}

//time complexity :: O(n)
// approach :: add all the numbers in array and then subtract it from the expected sum and you'll find the missing term