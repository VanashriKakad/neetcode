class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalGas =0;
        int totalCost =0;
        int startInd = 0;

        int sum =0;

        for(int i=0;i<gas.length;i++){
            totalGas += gas[i];
            totalCost += cost[i];

            sum += gas[i]-cost[i];

            if(sum <0){
                sum = 0;
                startInd = i+1;
            }
        }

        if(totalGas<totalCost){
            return -1;
        }

        return startInd;
        
    }
}
