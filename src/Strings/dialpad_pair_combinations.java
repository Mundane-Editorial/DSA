package Strings;


public class dialpad_pair_combinations {
    public static void main(String[] args) {
        String str = "13";
        System.out.println(findcombinations(str));
    }

    private static String findcombinations(String str) {
        String[] collection = {"","abc", "def", "ghi", "jlk", "mno", "pqrs", "tuv", "wxyz"};
        int n = str.length();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = str.charAt(i) - '0';
        }

        StringBuilder s = new StringBuilder();
        for(int i=0; i<collection[arr[0]].length(); i++){
                char ch1 = collection[arr[0]].charAt(i);
            for(int j=0; j<collection[arr[1]].length(); j++){
                char ch2 = collection[arr[1]].charAt(j);

                String temp = String.valueOf(ch1)+ ch2;
                s.append(temp);
            }
        }

        return s.toString();
    }
}
