class Solution {
    public int maxFrequencyElements(int[] nums) {
        int n =nums.length;
        int ans=0;
        int max=0;
        int freq[]= new int[101];
        for( int i=0; i<n; i++){
            freq[nums[i]]++;
            max=Math.max(max, freq[nums[i]]);
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i]==max){
                ans+=freq[i];
            }
        }
        return ans;
    }
}