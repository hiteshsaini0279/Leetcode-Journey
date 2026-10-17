class Solution {
    public static boolean increase(int nums[]){
        int n=nums.length;
        for(int i =1; i<n; i++){
            if(nums[i-1]>nums[i]){
                return false;
            }
        }
        return true;
    }
     public static boolean decrease(int nums[]){
        int n=nums.length;
        for(int i =1; i<n; i++){
            if(nums[i-1]<nums[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        return increase(nums)||decrease(nums);
    }
}