package GATE;

public class octal_to_decimal {
    public static void main(String args[]){
        int n = 123;
        int rem=0, dec=0;
        int i=1;

        while(n != 0){
            rem = n % 10;
            if(rem > 7){
                break;
            } else {
                dec = dec + rem * i;
                i = i * 8;
            }
            n = n / 10;
        }

        System.out.println(dec);
    }
}
