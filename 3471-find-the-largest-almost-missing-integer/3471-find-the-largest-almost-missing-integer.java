class Solution {
    public int largestInteger(int[] nums, int k) {
        int n=nums.length;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(!list.contains(nums[i])){
                list.add(nums[i]);
            }
        }
         ArrayList< ArrayList<Integer>> set= new ArrayList<>();
         for(int i=0; i+k<=n; i++){
            ArrayList<Integer> s= new ArrayList<>();
            for(int j=i; j<i+k; j++  ){
                if(i+k-i==k){
                       s.add(nums[j]);
                }
            }
            set.add(s);
         }
         int ans=-1;
         for(int i=0; i<list.size(); i++){
            int count=0;
            for(int j=0; j<set.size(); j++){
                if(set.get(j).contains(list.get(i))){
                    count++;
                }
            }
            if(count==1){
                ans=Math.max(ans,list.get(i));
            }
         }
return ans;
    }
}