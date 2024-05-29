package Dcpd.DAY_1;

public class Amazon_WIFI {
    public static void main(String[] args) {
        int[] buildingCount = {1, 2, 1, 2, 2};
        int[] routerLocation = {3, 1};
        int[] routerRange = {1, 2};

        int result = ServedBuildings(buildingCount, routerLocation, routerRange);
        System.out.println("maximum Buildings served :: "+result);  // Output the result
    }

    private static int ServedBuildings(int[] buildingCount, int[] routerLocation, int[] routerRange) {
        int n = buildingCount.length;
        int[] coverage = new int[n];

        for(int i=0;i<routerLocation.length;i++){
            int location = routerLocation[i] - 1;
            int range = routerRange[i];
            int start = Math.max(0, location - range);
            int end = Math.min(n - 1, location + range);

            for (int j = start; j <= end; j++) {
                coverage[j] += 1;
            }
        }

        int servedCount = 0;
        for (int i = 0; i < n; i++) {
            if (coverage[i] >= buildingCount[i]) {
                servedCount += 1;
            }
        }

        return servedCount;
    }

}
