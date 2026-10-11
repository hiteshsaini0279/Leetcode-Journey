class Solution {
    public boolean judgeSquareSum(int c) {
  int limit = (int)Math.sqrt(c);
HashSet<Integer> set = new HashSet<>();

    for(int i=0; i<limit+1; i++){
      int square = i * i;
     set.add(square);
    }
   
for(int v:set){
    if(set.contains(v)&&set.contains(c-v)){
        return true;
    }
}
return false;
    }
}