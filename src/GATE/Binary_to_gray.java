package GATE;

import java.io.*;
class Binarty_to_gray{
    public static void main(String args[]){
        int binary = 1100;
        int gray =0;
        int x=0;
        while(binary>0){
            int rem = binary%10;
            n=n/10;
            int rem2 = binary%10;
            if(!rem&&rem2  || rem&&!rem2){
                gray = gray + Math.pow(10,x)
            }
            x++;
        }
    }
}