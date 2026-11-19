class Solution {
    public int specialArray(int[] nums) {
int ans=-1;
        int n=nums.length;
        for(int i=0; i<=1000; i++ ){
            int count=0;
            for(int j=0; j<n; j++){
         if (nums[j]>=i){
            count++;
          }
            }
            if(count==i){
                ans=i;
            }
        }
        return ans;
    }
}