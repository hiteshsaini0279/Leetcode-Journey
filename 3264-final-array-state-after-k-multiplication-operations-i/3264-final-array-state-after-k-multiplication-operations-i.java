class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n= nums.length;
        int   first_min=Integer.MAX_VALUE;
        int idx=0;
        int operation=0;
        for(int i=0; i<n; i++){
        if(nums[i]<first_min){
            first_min=nums[i];
            idx=i;
        }
    }
    nums[idx]=first_min*multiplier;
operation++;
 while(operation<k){
     int  min=Integer.MAX_VALUE;
     int j=0;
    for(int i=0; i<n; i++){
if(nums[i]<min){
    min=nums[i];
    j=i;
}
    }
    nums[j]=min*multiplier;
    operation++;
 }
 return nums;
    }
}