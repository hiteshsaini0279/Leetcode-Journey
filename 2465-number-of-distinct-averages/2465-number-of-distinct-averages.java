class Solution {
    public int distinctAverages(int[] nums) {
        int n= nums.length;
        int idx=0;
         double arr[]= new double[n/2];
        Arrays.sort(nums);
        int start=0;
        int  end=n-1;
while(start<end){
double  val=(double) (nums[start]+nums[end])/2;
arr[idx++]=val;
start++;
end--;
}
HashSet<Double>  set= new HashSet<>();
for(int i=0; i<arr.length; i++){
 set.add(arr[i]);
}
return set.size();
    }
}