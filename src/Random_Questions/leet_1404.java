package Random_Questions;

public class leet_1404 {
    public static void main(String args[]){
        String s = "1101";
        System.out.println("Minimum no. operations :: "+ minimumoperations(s));
    }

    private static double minimumoperations(String s) {
        int l = s.length();
        int sum =0;
        int j=0;
        int temp =0;
        for(int i=l-1;i>=0;i--,j++){
            char ch = s.charAt(i);
            if(ch == '1'){
//                sum = sum + Math.pow(2,j);
            }
        }


        int mincount = 0;
        while(sum!=1){
            if(sum%2!=0){
                sum=sum+1;
                mincount++;
            }else{
                sum=sum/2;
                mincount++;
            }
        }
        return mincount;
    }
}
