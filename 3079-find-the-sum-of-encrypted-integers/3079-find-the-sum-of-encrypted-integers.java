class Solution {
    public static  int replace(int num){
        ArrayList<Integer> list=  new ArrayList<>();
        while(num>0){
            int last= num%10;
            list.add(last);
            num=num/10;
        }
        int max=0;
        for(int i =0; i<list.size(); i++){
            if(max<list.get(i)){
         max=list.get(i);
            }
        }
       for(int i =0; i<list.size(); i++){
       list.set(i,max);
        } 
        int ans=0;
        for(int i =0; i<list.size(); i++){
            ans=ans*10+list.get(i);
        }
        return ans;
    }
    public int sumOfEncryptedInt(int[] nums) {
        int n=nums.length;
        int ans=0;
        for(int i=0; i<nums.length; i++){
            ans+=replace(nums[i]);

        }
        return ans;
    }
}