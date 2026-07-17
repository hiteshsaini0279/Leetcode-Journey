class Solution {
    public int countPartitions(int[] nums) {
        int ans=0;
        int n=nums.length;

        for(int i=0; i<n-1; i++){
            int rightSum=0;
            int leftSum=0;
            for(int j=0; j<=i; j++){
              leftSum+=nums[j];
            }
            for(int j=i+1; j<n; j++){
                rightSum+=nums[j];
            }
            int dif=leftSum-rightSum;
            if(dif%2==0){
                ans++;
            }
        }
        return ans;
    }
}