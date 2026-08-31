class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        ArrayList<Integer> list= new ArrayList<>();
      int diff[]= new int[arr.length];
      for(int i =0; i<arr.length; i++){
        diff[i]=Math.abs(arr[i]-x);
      }
      int val=0;
      while(val<k){
        int   min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i =0; i<arr.length; i++){
        if(diff[i]!=Integer.MIN_VALUE&&min>diff[i]){
            min=diff[i];
            idx=i;
        }
      }
      list.add(arr[idx]);
      diff[idx]=Integer.MIN_VALUE;
      val++;
      }
 Collections.sort(list);
      return list;
    }
}