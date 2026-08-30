class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int maxIDX=0;
        int min=Integer.MAX_VALUE;
         int minIDX=0;
        for(int i=0; i<nums.length; i++){
            if(min>nums[i]){
                min=nums[i];
                minIDX=i;
            }
            if(max<nums[i]){
                max=nums[i];
                maxIDX=i;
            }
        }
        int ans1=Math.max(minIDX, maxIDX) + 1;
        int ans2=nums.length-Math.min(minIDX,maxIDX);
       int ans3 = Math.min(minIDX, maxIDX) + 1
         + nums.length - Math.max(minIDX, maxIDX);
        return Math.min(ans1,Math.min(ans2,ans3));
    }
}