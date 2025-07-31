package interview_top_150_leetcode;
import java.util.Arrays;
public class h_index {
    public static void main(String[] args) {
        int[] citations = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(hindex(citations));
    }

    private static int hindex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;

        for(int i=0; i<n; i++){
            if(citations[i] >= n-i){
                return n-i;
            }
        }
        return 0;
    }
}
