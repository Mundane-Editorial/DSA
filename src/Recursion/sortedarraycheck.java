package Recursion;

public class sortedarraycheck {
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        boolean res = issorted(arr,0);
        System.out.println(res);
    }

    private static boolean issorted(int[] arr, int l) {
        if(l == arr.length-1)
        {
            return true;
        }

        if(arr[l]<arr[l+1])
        {
            return issorted(arr, l+1);
        }
        else {
            return false;
        }
    }
}
