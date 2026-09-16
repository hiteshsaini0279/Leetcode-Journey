class Solution {
    public static int solveFunc(int f, int val){
boolean check=true;int start=0;
while(check){
if((f ^ start) == val){
        return start;
    }
    start++;
}
return start;
    }
    public int[] decode(int[] encoded, int first) {
       ArrayList<Integer> list= new ArrayList<>();
       list.add(first);
     while(list.size()!=encoded.length+1){
  list.add(solveFunc(list.get(list.size()-1),encoded[list.size()-1]));
     }
      int ans[]= new int[encoded.length+1];
      for(int i =0; i<ans.length; i++){
        ans[i]=list.get(i);
      }
      return ans; 
    }
}