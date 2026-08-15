class Solution {
    public boolean divideArray(int[] nums) {
        int n=nums.length;
        int freq[]= new int[501];
         for(int i =0; i<n; i++){
            freq[nums[i]]++;
         }
int ans=0;
         for(int i =0; i<freq.length; i++){
            if(freq[i]>=2){
                while(freq[i]>=2){
       ans+=(freq[i]/2);
       freq[i]=freq[i]%2;
                }
            }
            if(ans==n/2){
                    return true;
                }
         }
         return false;
    }
}