class Solution {
    public static   boolean  smaller(int arr[], int val){
        int n =arr.length;
for(int i=0; i<n; i++){
    if(arr[i]<val){
        return true;
    }
}
return false;
    }
      public static   boolean  greater(int arr[], int val){
        int n =arr.length;
for(int i=0; i<n; i++){
    if(arr[i]>val){
        return true;
    }
}
return false;
    }
    public int countElements(int[] nums) {
        int ans=0;
       int n =nums.length; 
  for(int i =0; i<n; i++){
 if(smaller(nums,nums[i])&&greater(nums,nums[i])){
    ans++;
 }
  }
  return ans;

    }
}