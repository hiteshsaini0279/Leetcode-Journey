class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int ans[]= new int[nums.size()];
        for(int i=0; i<nums.size(); i++){
            boolean check=false;
   for(int j=1; j<=nums.get(i); j++){
      int c= j|(j+1);
      if(c==nums.get(i)){
        check=true;
        ans[i]=j;
        break;
      }
   }
   if(check==false){
    ans[i]=-1;
   }
        }
        return ans;
    }
}