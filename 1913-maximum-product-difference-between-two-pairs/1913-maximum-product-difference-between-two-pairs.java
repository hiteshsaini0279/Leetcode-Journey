class Solution {
    public int maxProductDifference(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        return Math.abs(nums[0]*nums[1]-nums[n-2]*nums[n-1]);
    }
}