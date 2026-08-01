class Solution {
    public int missingMultiple(int[] nums, int k) {
        int n= nums.length;
        HashSet<Integer> set = new HashSet<>();
        for(int i =0; i<n; i++){
            set.add(nums[i]);
            
        }
        int ans=0;
        for(int i=1; i<=200; i++){
            if(!set.contains(i*k)){
                ans=i*k;
                break;
            }
        }
        return ans;
    }
}