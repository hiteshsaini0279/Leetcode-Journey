class Solution {
    public static boolean check(int arr[]){
       return 2*(arr[0]+arr[2])==arr[1];
    }
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<n-2; i++){
            int ne[]= new int[3];
            int idx=0;
      for(int j=i; j<i+3; j++){
     ne[idx++]=nums[j];
      }
      if(check(ne)){
        ans++;
      }
        }
        return ans;
    }
}