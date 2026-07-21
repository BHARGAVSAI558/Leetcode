class Solution 
{
    public int stairs(int dp[],int cost[],int n){
    
    if(n==0){
        return cost[0];
    }
    if(n==1){
        return cost[1];
    }

    if(dp[n]!=-1){
        return dp[n];
    }

    dp[n]=cost[n]+Math.min(stairs(dp,cost,n-1),stairs(dp,cost,n-2));

    return dp[n];

    }
    public int minCostClimbingStairs(int[] cost) {

        int n=cost.length;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);

            return Math.min(stairs(dp,cost,n-1),stairs(dp,cost,n-2));
    }
}