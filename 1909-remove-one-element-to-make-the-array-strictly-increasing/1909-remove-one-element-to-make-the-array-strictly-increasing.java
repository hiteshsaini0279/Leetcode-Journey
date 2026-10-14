class Solution {
    public static boolean  check(int arr[]){
        if(arr.length==1){
            return true;
        }
        for(int i=1; i<arr.length; i++){
            if(arr[i-1]>=arr[i]){
           return false;
            }
        }
        return true;
    }
    public boolean canBeIncreasing(int[] nums) {
        int n=nums.length;
        for(int i=0; i<n; i++){
            int arr[]= new int[n-1];
            int idx=0;
            for(int j=0; j<n; j++){
               if(j!=i){
                 arr[idx++]=nums[j];
               }
            }
            if(check(arr)){
                return true;
            }
        }
        return false;
    }
}