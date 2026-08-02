class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        int ans=0;
        int freq[]= new int[101];
        for(int i=0; i<nums.length; i++){
            freq[nums[i]]++;
        }
        for(int i =0; i<freq.length; i++){
            if(freq[i]%k==0){
                int start=0;
           while(start<freq[i]){
            ans+=i;
            start++;
           }
            }
        }
        return ans;
    }
}