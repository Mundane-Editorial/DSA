package Random_Questions;

public class Reverse_String_II_541 {
    public static void main(String args[]){
        String s = "fnqcqnajmebeddqsgl";
        int k = 39;
        System.out.println(reverseStr(s,k));
    }

    private static String reverseStr(String s, int k) {
        char[] ch = s.toCharArray();

        for(int i=0;i<s.length()-1;i=i+(k*2)){
            int left = i;
            int right = Math.min(i+k-1, s.length()-1);
            while(left<right){
                char temp = ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left++;
                right--;
            }
        }
        return new String(ch);
    }

}
