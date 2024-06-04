package GATE;

public class binary_to_octal {
    public static void main(String args[]){
        int n = 101011;
        int count = 0;
        int oct = 0;
        int rem = 0;
        int i = 1;
        String octalString = "";

        while(n != 0){
            rem = n % 10;
            oct = oct + rem * i;
            i = i * 2;
            count++;

            if(count == 3){
                octalString = oct + octalString;   //string ki property hogi shaayd .. pta ni
                count = 0;
                i = 1;
                oct = 0;
            }

            n = n / 10;
        }

        if(count != 0){
            octalString = oct + octalString;
        }

        System.out.println(octalString);
    }
}
