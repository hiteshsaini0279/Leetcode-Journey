class Solution {
    public boolean uniformArray(int[] nums1) {
        int n= nums1.length;

        for(int i=0; i<n; i++){
            if(nums1[i]%2==0){
        for(int j=0; j<n; j++){
        if(i!=j&&nums1[j]%2!=0){
            nums1[i]=nums1[i]-nums1[j];
            break;
        }
        }
            }
        }
        boolean odd=false;
        boolean even=false;
    for(int i =0; i<n; i++){
        if(even&&odd){
           return false;
        }
  if(nums1[i]%2==0){
    even=true;
  }
  if(nums1[i]%2!=0){
    odd=true;
  }
    }
 return true;
    }
}