class Solution {

    int min(int x,int y,int z){
        if(x<=y && y<=z)
        return x;
        else if(y<=z && y<=x)
        return y;
        else 
        return z;

    }
    
    public int minDistance(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();

        int dp[][]=new int[m+1][n+1];
          char []s1=word1.toCharArray();
            char []s2=word2.toCharArray();
        for(int i=0;i<n+1;i++){
            dp[0][i]=i;
        }
        for(int i=0;i<m+1;i++){
            dp[i][0]=i;
        }

        for(int i=1;i<m+1;i++){
         for(int j=1;j<n+1;j++)
         {
          

            if(s1[i-1]==s2[j-1])
            dp[i][j]=dp[i-1][j-1];
            else 
            dp[i][j]=1+min(dp[i][j-1],dp[i-1][j-1],dp[i-1][j]);
         }
        }
        return dp[m][n];
    }
}