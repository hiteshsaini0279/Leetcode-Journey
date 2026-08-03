class Solution {
 public static int largestDigit(int n ){
    int ans=0;
    while(n>0){
        int last= n%10;
        if(last>ans){
            ans=last;
        }
        n=n/10;
    }
    return ans;
 }
    public int maxSum(int[] nums) {
        int max=-1;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(largestDigit(nums[i])==largestDigit(nums[j])){
                    max=Math.max(max, nums[i]+nums[j]);
                }
            }
        }
        return max;
    }
}