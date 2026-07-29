class Solution {
 
    public int maxAscendingSum(int[] nums) {
        int max=0;
        int prefixSum[]= new int[nums.length];
        prefixSum[0]=nums[0];
        for(int i=1; i<nums.length; i++){
            prefixSum[i]= prefixSum[i-1]+nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int curr=0;
            boolean asc=true;
            for(int j=i; j<nums.length; j++){
                    if (j > i && nums[j] <= nums[j - 1]) {
        asc = false;
                  }
             curr=i==0?prefixSum[j]:prefixSum[j]-prefixSum[i-1];
             if(asc){
                max=Math.max(max,curr);
             }
            }
        }
        return max;
    }
}