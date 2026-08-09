class Solution {
    public static int  catalan(int n , int dp[]){
        if(n==1||n==0){
            return 1;
        }
        if(dp[n]!=-1){
            return dp[n];

        }
        int ans=0;
        for(int i =0; i<=n-1; i++){
      ans+=catalan(i,dp)*catalan(n-i-1,dp);
        }
        dp[n]=ans;
        return dp[n];
    }
    public int numTrees(int n) {
       int dp[]= new int[n+1];
       for(int i=0; i<dp.length; i++){
        dp[i]=-1;
       } 
       return catalan(n,dp);
    }
}