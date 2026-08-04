class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
           int count=0; int  count1=0;
        for(int i=0; i<n; i++){
            if(nums[i]>0){
                count++;
            }
            if(nums[i]<0){
                count1++;
            }
        }
 return Math.max(count, count1);

    }
}