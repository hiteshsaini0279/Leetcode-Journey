class Solution {
    public List<Integer> findLonely(int[] nums) {
   int[] freq = new int[1000001];
   ArrayList<Integer> ans= new ArrayList<>();
   HashSet<Integer> set= new HashSet<>();
   for(int i=0; i<nums.length; i++){
    set.add(nums[i]);
    freq[nums[i]]++;
   }
int start=0; int last=freq.length-1;
while(start<last){
    if(freq[start]==1&& !set.contains(start-1)&& !set.contains(start+1)){
           ans.add(start);
    }
       if(freq[last]==1&& !set.contains(last-1)&& !set.contains(last+1)){
           ans.add(last);
    }
    start++;
    last--;
}
return ans;
    }
}