class Solution {
    public int[] decompressRLElist(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<n; i+=2){
           int count=0;
           while(count<nums[i]){
            list.add(nums[i+1]);
            count++;
           }
        }
        int ans[]= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}