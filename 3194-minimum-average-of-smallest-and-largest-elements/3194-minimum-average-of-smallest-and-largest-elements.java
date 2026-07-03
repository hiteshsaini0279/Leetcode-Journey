class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int start=0; 
        int end=nums.length-1;
ArrayList<Double> list = new ArrayList<>();
while(start<end){
   double av=(nums[start]+nums[end])/2.0;
   list.add(av);
   start++;
   end--;
}
double ans= Double.MAX_VALUE;
for(int i=0; i<list.size(); i++){
    ans=Math.min(ans,list.get(i));
}
return ans;
    }
}