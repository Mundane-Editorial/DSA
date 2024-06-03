package Random_Questions;

public class reverse_string_potd_344 {
    public static void main(String args[]){
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }
    private static void reverseString(char[] s) {
        int first = 0;
        int last = s.length-1;

        while(first<last){

            swap(s,first,last);
            first++;
            last--;
        }
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }

    }

    private static void swap(char[] s, int first, int last){
        char temp = s[first];
        s[first] = s[last];
        s[last] = temp;
    }
}
