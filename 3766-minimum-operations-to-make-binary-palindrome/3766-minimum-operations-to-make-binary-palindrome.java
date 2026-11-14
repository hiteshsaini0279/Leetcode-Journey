class Solution {
    public static boolean check(int i){
        String s=Integer.toString(i,2);
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public int[] minOperations(int[] nums) {
        int n= nums.length;
        int ans[]= new int[n];
      boolean palin[]= new boolean[5001];
 for(int i=0; i<palin.length; i++){
    palin[i]=check(i);
 }
 for(int i=0; i<nums.length; i++){
    if(palin[nums[i]]){
        ans[i]=0;
    }else{
        int answer=Integer.MAX_VALUE;
        for(int j=0; j<palin.length; j++){
  if(nums[i]!=j&&palin[j]){
    answer=Math.min(answer,Math.abs(j-nums[i]));
  }
        }
        ans[i]=answer;
    }
 }
return ans;
    }
}