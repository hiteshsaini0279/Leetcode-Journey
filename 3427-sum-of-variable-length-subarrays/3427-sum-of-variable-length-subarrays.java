class Solution {
    public int subarraySum(int[] nums) {
        int ans=0;
        int n=nums.length;
        int prefix[]= new int[n];
        prefix[0]= nums[0];
        for(int i=1; i<n; i++){
          prefix[i]= prefix[i-1]+nums[i];
        }
        ans+=prefix[0];
        int start=0;
        for(int i=1; i<n; i++){
          start= Math.max(0, i - nums[i]);
         int sum=start==0?prefix[i]:prefix[i]-prefix[start-1];
         ans+=sum;
        }
       return ans;
    }
}