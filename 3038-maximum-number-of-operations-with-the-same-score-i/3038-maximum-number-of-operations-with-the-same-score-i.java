class Solution {
    public int maxOperations(int[] nums) {
        int n= nums.length;
          if(n==2){
            return 1;
          }
          int ans=1;
          int score=nums[0]+nums[1];
        for(int  i=2; i+1<n; i+=2){
            if(i<n&&(i+1)<n){
                if(nums[i]+nums[i+1]==score){
                    ans++;
                }else {
                    break;
                }
            }
        }
        return ans;
    }
}