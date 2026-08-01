class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int val=nums[0];
        List<Integer> ans= new ArrayList<>();
        for(int i=0; i<nums.length; i++ ){
            if(val!=nums[i]){
             while(val<nums[i]){
             ans.add(val++);
             }
            }
            val++;
        }
        return ans;
    }
}