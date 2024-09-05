package SAP_labs;

public class Prime_number_sum {
    public static void main(String[] args) {
        int a = 2;
        int b = 5;

        System.out.println(calculatesum(a,b));
    }

    private static double calculatesum(int a, int b) {
       //double sum = Math.pow(a,3) + Math.pow(b,3) + Math.pow(a,2)*b + Math.pow(b,2)*a + 2*Math.pow(a,2)*b + 2*a*Math.pow(b,2);
        double sum = (a+b) * (a+b) *  (a+b);
       return sum;
    }
}
