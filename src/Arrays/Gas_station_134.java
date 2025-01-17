package Arrays;

public class Gas_station_134 {
    public static void main(String[] args) {
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        System.out.println(canCompleteCircuit(gas, cost));
    }

    private static int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int currentgas = 0;
        int startstation = 0;

        for(int i=0; i<gas.length; i++){
            totalgas += gas[i] - cost[i];
            currentgas += gas[i] - cost[i];

            if(totalgas < 0){
                startstation = i + 1;
                currentgas = 0;
            }
        }

        return totalgas >= 0 ? startstation : -1;
    }
}
