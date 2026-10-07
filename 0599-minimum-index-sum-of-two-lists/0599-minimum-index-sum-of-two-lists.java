class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
    ArrayList<String> list= new ArrayList<>();
      int ans=Integer.MAX_VALUE;
      int n=list1.length;
      int l=list2.length;
      for(int i=0; i<n; i++){
        for(int j=0; j<l; j++){
if(list1[i].equals(list2[j])){
     ans=Math.min(ans,i+j);
}
        }
      }
         for(int i=0; i<n; i++){
        for(int j=0; j<l; j++){
if(list1[i].equals(list2[j])&&i+j==ans){
     list.add(list1[i]);
}
        }
      }
        String solve[]=new String[list.size()];
        for(int i=0; i<list.size(); i++){
            solve[i]=list.get(i);
        }
        return solve;
    }
}