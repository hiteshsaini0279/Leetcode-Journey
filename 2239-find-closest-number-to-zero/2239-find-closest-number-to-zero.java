class Solution {
    public int findClosestNumber(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int num=nums[0];
        int distance=Math.abs(nums[0]-0);
         for(int i=1; i<n; i++){
           int dist=Math.abs(nums[i]-0);
           if(distance>=dist){
              distance=dist;
               num=nums[i];
           }

         }
         return num;
    }
}