import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

class contiguousarray_525
{
    /*public static void main(String args[]) throws IOException{
        int arr[] = {0,1,1,0,1,1,1,0};
        int result = totallength(arr);
        System.out.println(result*2);
    }

    static int totallength(int[] arr)
    {
        int sum=0;
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        while(r > l) {
            if(arr[l] + arr[r] == 1)
            {
                sum++;
            }
            l++;
            r--;
        }
        return sum;
    }*/ //Not an optimised solution461/564 test cases passed only

    public static int Solution(int[] arr)
    {
        int ans = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0;
        int i;
        for(i = 0; i < arr.length; i++)
        {
            if(arr[i] == 0)
                sum = sum - 1;
            else if(arr[i] == 1)
            {
                sum = sum + 1;
            }
        }

        if(map.containsKey(sum))
        {
            int index = map.get(sum);
            int len = i - index;
            if(len > ans)
            {
                ans = len;
            }else{
                map.put(sum, i);
            }
        }
        return ans;
    }


    public static void main(String args[])throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buf.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = Integer.parseInt(buf.readLine());
        }
        System.out.println(Solution(arr));
    }
}