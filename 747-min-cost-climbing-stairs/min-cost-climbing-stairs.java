class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        for(int i=2;i<n;i++){
            int c = cost[i];
            cost[i] = Math.min(c+cost[i-1], c+cost[i-2]);
        }
        return Math.min(cost[n-1], cost[n-2]);
    }
}