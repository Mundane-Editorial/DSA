package Random_Questions;

public class score_of_a_string {
    public static void main(String args[]){
        String str = "hello";
        System.out.println(scoreOfString(str));
    }

    private static int scoreOfString(String s) {
        int sum =0;
        int first = 0;
        int second = 1;
        while(second<s.length()){
            char ch = s.charAt(first);
            char chh = s.charAt(second);

            sum +=  Math.abs(ch-chh);
            first++;
            second++;
        }
        return sum;
    }
}
