class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        long ans=0;
        while(start<=end){
            if(start==end){
                  ans+=(long)nums[start];
                  return ans;
            }
     String f1=String.valueOf(nums[start]);
     String f2=String.valueOf(nums[end]);
     String s=f1+f2;
 long num = Long.parseLong(s);
 ans+=num;
 start++;
 end--;
        }
        return ans;
    }
}