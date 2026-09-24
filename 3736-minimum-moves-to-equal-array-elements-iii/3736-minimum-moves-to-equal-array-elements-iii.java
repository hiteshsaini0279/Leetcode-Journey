class Solution {
    public int minMoves(int[] nums) {
        int n =nums.length;
        Arrays.sort(nums);
        int ans=0;
        for(int i=0; i<n-1; i++){
            ans+=(Math.abs(nums[n-1]-nums[i]));
        }
        return ans;
    }
}