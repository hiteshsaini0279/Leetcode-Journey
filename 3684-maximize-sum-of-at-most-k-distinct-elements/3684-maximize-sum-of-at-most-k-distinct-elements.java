class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=nums.length-1; i>=0; i--){
            if(list.size()<k&&!list.contains(nums[i])){
                 list.add(nums[i]);
            }
            if(list.size()==k){
                break;
            }
        }
         int ans[]= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
return ans;
    }
}