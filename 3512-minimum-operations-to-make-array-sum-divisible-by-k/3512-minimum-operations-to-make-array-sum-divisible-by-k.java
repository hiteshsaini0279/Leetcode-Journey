class Solution {
    public int minOperations(int[] nums, int k) {
    int ans=0;
     int n=nums.length;
     int sum=0;
     for(int i =0; i<n; i++){
        sum+=nums[i];
     }
     if(sum%k==0){
        return ans;
     }
     boolean hitesh=false;
     while(!hitesh){
        sum=sum-1;
        ans++;
        if(sum%k==0){
            hitesh=true;
        }
     }
     return ans;
    }
}