class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int prefix[]= new int[n];
        int ans=Integer.MAX_VALUE;
        prefix[0]=nums.get(0);
  for(int i =1; i<n; i++){
      prefix[i]= prefix[i-1]+nums.get(i);
  }
        while(l<=r){
       for(int i =0; i<n; i++){
        for(int j=i; j<n; j++){
     if(j-i+1==l){
        int sum=i==0?prefix[j]:prefix[j]-prefix[i-1];
if (sum > 0) {
    ans = Math.min(ans, sum);
}
     }
        }
       }
       l++;
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
return ans;
    }
}