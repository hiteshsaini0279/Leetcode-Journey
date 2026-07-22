class Solution {

    public List<Boolean> prefixesDivBy5(int[] nums) {
        int n =nums.length;
        List<Boolean> ans= new ArrayList<>();
        int current=0;
        for(int i=0; i<n; i++){
         current=(current*2+nums[i])%5;
         ans.add(current==0);
        }

        return ans; 
    }
}