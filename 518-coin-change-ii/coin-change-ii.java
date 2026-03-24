class Solution {

    public int ans(int nums[],int s)
    {
        int n=nums.length;
        int dp[][]=new int[n+1][s+1];
        for(int i=0;i<=n;i++){
            dp[i][0]=1;

        }
        for(int i=0;i<=s;i++){
            dp[0][i]=0;
        }
        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                if(nums[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=(dp[i-1][j]+dp[i][j-nums[i-1]]);

                }
            }

        }
        return dp[n][s];
        

    }
    public int change(int amount, int[] coins)
    
     {
        return ans(coins,amount);
    }
}