class Solution {
    public int findMaxK(int[] nums) {
    int n=nums.length;
    HashSet<Integer> set= new HashSet<>();
    for(int i=0; i<n; i++){
set.add(nums[i]);
    }
    Arrays.sort(nums);
    int start=0;
    int end=n;
    while(start<end){
        if(set.contains(nums[start])&&set.contains(-nums[start])){
            return Math.abs(nums[start]);
        }
        start++;
    }
    return -1;
    }
}