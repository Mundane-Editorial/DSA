package SAP_labs;

public class reverse_string {
    public static void main(String[] args) {
        String str = "SAP LABS COMITEMENT";

        System.out.println(reverse(str));
    }

    private static String reverse(String str) {
        int l = str.length();
        String temp = "";
        for(int i=0; i<l; i++){
            char ch = str.charAt(i);

            temp = ch + temp;
        }
        return temp;
    }
}


//time complexity :: O(n)