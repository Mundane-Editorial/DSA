package interview_top_150_leetcode;

public class gas_station {
    static int[] gas = {1,2,3,4,5};
    static int[] cost = {3,4,5,1,2};

    public static void main(String[] args) {
        System.out.println(canComplete(gas, cost));
    }

    private static int canComplete(int[] gas, int[] cost) {
        int totaldiff = 0;
        int n = gas.length;
        int index = 0;
        int fuel = 0;

        for(int i=0; i<n; i++){
            int diff = gas[i] - cost[i];
            totaldiff += diff;
            fuel += diff;

            if(fuel < 0){
                index = i+1;
                fuel = 0;
            }
        }

        return totaldiff < 0 ? -1 : index;
    }
}
