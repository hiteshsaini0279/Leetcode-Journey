class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        int ans[]= new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<n; i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                map.put(nums[i],map.get(nums[i])+1);
            }
        }
        int idx=0;
        for(Integer key : map.keySet()) {
    if(idx<ans.length&&map.get(key)==1){
ans[idx++]=key;
    }
}
return ans;
    }
}