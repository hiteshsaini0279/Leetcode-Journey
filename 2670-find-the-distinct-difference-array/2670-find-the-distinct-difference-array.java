class Solution {
    public int[] distinctDifferenceArray(int[] nums) {
        int n=nums.length;
         int diff[]= new int[n];
   for(int i=0; i<n; i++){
    HashSet<Integer> set= new HashSet<>();
      HashSet<Integer> set1= new HashSet<>();
    for(int j=0; j<=i; j++ ){
        set.add(nums[j]);
    }
     for(int j=i+1; j<n; j++ ){
        set1.add(nums[j]);
    }
    diff[i]=set.size()-set1.size();
   }
        return diff;
    }
}