package SAP_labs;

public class appends_strings {
    public static void main(String[] args) {
        String s1 = "hello0000000";
        String s2 = "man";

        System.out.println(mergefunc(s1,s2));
    }

    private static String mergefunc(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        int l = Math.min(l1,l2);
        String temp = "";
        for(int i=0; i<l; i++){
            char ch = s1.charAt(i);
            char ch2 = s2.charAt(i);
            temp = temp + ch + ch2;
        }

        if(l1 > l){
            temp = temp + s1.substring(l);
        }else{
            temp = temp + s2.substring(l);
        }
        return temp;
    }
}
