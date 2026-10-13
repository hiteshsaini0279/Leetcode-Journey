class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n=nums.length;
        int sq[]= new int[n];
        for(int i=0; i<n; i++){
            sq[i]=nums[i]*nums[i];
        }
        Arrays.sort(sq);
     long ans=0;
        int start=0;
        int end=n-1;
        while(start<end){
            ans=(long)(ans+sq[end]-sq[start]);
            start++;
            end--;
        }
        if(n%2!=0){
            ans+=(long)sq[start];
        }
        return ans;
    }
}