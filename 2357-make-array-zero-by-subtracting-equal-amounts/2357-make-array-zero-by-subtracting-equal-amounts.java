class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int x=Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
                continue;
            }
            x= Math.min(x, nums[i]);
        }
        boolean check=false;
        int operation=0;
      while(!check){
        boolean check1= true;
        int count=0;
          for(int i=0; i<n; i++){
            if(nums[i]==0){
             continue;
            }
         if(nums[i]!=0){
               nums[i]=nums[i]-x;
               count++;
         }
        }
     if(count!=0){
           operation++;
     }

        for(int i=0; i<n; i++ ){
   if(nums[i]!=0){
    x=nums[i];
     check1=false;
     break;
   }
        }
        if(check1==true){
            check=true;
     
        } 
      }
     return operation;   
    }
}