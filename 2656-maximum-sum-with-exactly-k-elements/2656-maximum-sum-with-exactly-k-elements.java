class Solution {
    public int maximizeSum(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        int count=0;
        while(k>count){
  Arrays.sort(nums);
  ans+=nums[n-1];
  nums[n-1]=nums[n-1]+1;
  count++;
        }
        return ans;
    }
}