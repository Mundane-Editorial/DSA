package Strings;

public class zigzag_pattern {
    public static void main(String[] args) {
        String s = "HPLAPTOPISWORST";
        int numRows = 5;

        System.out.println(convert(s, numRows));
    }

    private static String convert(String s, int numRows) {
        if(s.length() < numRows || numRows == 1){
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i=0; i<numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currentrow = 0;
        boolean goingdown = false;

        for(char ch : s.toCharArray()){
            rows[currentrow].append(ch);

            if(currentrow == 0 || currentrow == numRows-1){
                goingdown = !goingdown;
            }

            currentrow = currentrow + (goingdown ? 1 : -1);
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder str : rows){
            res.append(str);
        }

        return res.toString();
    }
}
