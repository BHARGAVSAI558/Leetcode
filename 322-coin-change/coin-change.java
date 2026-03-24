class Solution {

    public int answer(int a[],int s)
    {
        int n=a.length;
        int dp[][]=new int[n+1][s+1];
       
        for(int i=0;i<=n;i++){
            dp[i][0]=0;
        }
        for(int j=1;j<=s;j++){
            dp[0][j]=Integer.MAX_VALUE-1;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=s;j++){
                if(a[i-1]>j){
                    dp[i][j]=dp[i-1][j];
                }
                else{
                    dp[i][j]=Math.min(
                        dp[i-1][j],
                        1+dp[i][j-a[i-1]]
                        );
                }
            }

        }
        
        return dp[n][s]==Integer.MAX_VALUE-1 ? -1:dp[n][s];
    }

    public int coinChange(int[] coins, int amount) 
    {

        return    answer(coins,amount);
        
    }
}