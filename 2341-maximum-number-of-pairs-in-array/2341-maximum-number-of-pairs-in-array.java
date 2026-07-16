class Solution {
    public int[] numberOfPairs(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        int ans[]= new int[2];
        for(int i=0; i<n; i++){
            list.add(nums[i]);
        }
        int count=0;
        for(int i=0; i<list.size(); i++){
            int idx=0;
            for(int j=i+1; j<list.size(); j++){
         if (list.get(i).equals(list.get(j))) {
    count++;
    list.remove(j);  
    list.remove(i);
    i--;  
    break;
}
            }
        }
        ans[0]=count;
        ans[1]=list.size();
return ans;
    }
}