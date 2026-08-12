class Solution {
    public static int mcm(int arr[], int i, int j, int dp[][]){
        // if(i==j){
        //     return 0;
        // }
            if(i>j){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=Integer.MIN_VALUE;
        for(int k=i; k<=j; k++){
            int cost1=mcm(arr,i,k-1,dp);
            int cost2=mcm(arr, k+1,j,dp);
            int cost3=arr[i-1]*arr[j+1]*arr[k];
            int finall =cost1+cost2+cost3;
            ans=Math.max(ans,finall);
        }
        dp[i][j]=ans;
        return dp[i][j];
    }
    public int maxCoins(int[] nums) {
        int n = nums.length;

        int[] arr = new int[n + 2];

        arr[0] = 1;
        arr[n + 1] = 1;

        for (int i = 0; i < n; i++) {
            arr[i + 1] = nums[i];
        }

        int[][] dp = new int[n + 2][n + 2];

        for (int i = 0; i < n + 2; i++) {
            Arrays.fill(dp[i], -1);
        }
 return mcm(arr,1,n,dp);
    }
}