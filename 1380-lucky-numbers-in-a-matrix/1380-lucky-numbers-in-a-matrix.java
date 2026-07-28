class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
       List<Integer> row= new ArrayList<>();
       List<Integer> col= new ArrayList<>();
    for(int i=0; i<matrix.length; i++){
          int min=Integer.MAX_VALUE;
          
        for(int j=0; j<matrix[0].length; j++){
            min=Math.min(min,matrix[i][j]);
        }
      row.add(min);
    }
       for(int i=0; i<matrix[0].length; i++){
          int max=Integer.MIN_VALUE;
        for(int j=0; j<matrix.length; j++){
            max=Math.max(max,matrix[j][i]);
        }
      col.add(max);
}
for(int i=0; i<col.size(); i++){
 if(row.contains(col.get(i))){
    ans.add(col.get(i));
 }
}
return ans;
    }
}