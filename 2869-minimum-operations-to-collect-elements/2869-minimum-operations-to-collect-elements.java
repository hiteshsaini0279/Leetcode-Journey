class Solution {
    public int minOperations(List<Integer> nums, int k) {
        List<Integer> ans=new ArrayList<>();
 boolean right= false;
 int idx=nums.size()-1;
        while (!right){
          ans.add(nums.get(idx--));
          int count=1;
          boolean check=true;
          while(count<=k){
            if(!ans.contains(count)){
                check =false;
                break;
            }
            count++;
          }
          if(check){
            right=true;
          }
        }
return ans.size();
    }
}