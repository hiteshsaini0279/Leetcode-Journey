class Solution {
    public int[] arrayRankTransform(int[] arr) {
     int n=arr.length;
     int nums[]=  arr.clone();
     int ans[]= new int[n];
     Arrays.sort(arr);
     HashMap<Integer,Integer> map= new HashMap<>();
     int rank=1;
     for(int i = 0; i < n; i++) {
            if(!map.containsKey(arr[i])) {
                map.put(arr[i], rank++);
            }
        }
   for(int i =0; i<n; i++){
   ans[i]=map.get(nums[i]);
}
   
     
      return ans;

      }
}