class Solution {
    public static int  Counts(int n , int d){
        int ans=0;
        while(n>0){
           int last=n%10;
           if(last==d){
            ans++;
           }
           n=n/10;
        }
        return ans;
    }
    public int countDigitOccurrences(int[] nums, int digit) {
      int answer=0;
      for (int i=0; i<nums.length; i++){
        answer+=Counts(nums[i],digit);
      }
      return answer;  
    }
}