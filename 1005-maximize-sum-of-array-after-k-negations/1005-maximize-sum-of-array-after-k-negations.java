class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int ans=0;
        int count=0;
        int  idx=-1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0){
                idx=i;
            }
            if( count<k&&nums[i]<0){
                nums[i]= -1* nums[i];
                count++;
            }
        }
        if(idx!=-1){
  while(count<k){
            nums[idx]=-nums[idx];
            count++;
        }
        }else{
            Arrays.sort(nums);
              while(count<k){
            nums[0]=-nums[0];
            count++;
        }
        }
      
   
     for(int i =0; i<nums.length; i++){
        ans+=nums[i];
     }
        return ans;
    }
}