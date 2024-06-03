package GATE;
public class hex_conversion {
    public static void main(String args[]){
        int n = 177;
        String hex ="";
        while(n != 0){
            int rem = n % 16;
            char ch;
            if(rem > 9){
                ch = (char)((rem - 10) + 'A');
            } else {
                ch = (char)(rem + '0');
            }
            hex = ch + hex;
            n = n / 16;
        }
        System.out.println(hex);
    }
}
