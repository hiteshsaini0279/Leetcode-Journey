class Solution {
    public int minimumOperations(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
int op=0;
        for(int i=0; i<n; i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0; j<m; j++){
               list.add(grid[j][i]);
            }
          for(int j=0; j+1<list.size(); j++){
        if(list.get(j)<list.get(j+1)){
            continue;
        }else{
            int diff=list.get(j)-list.get(j+1);
            list.set(j+1,list.get(j+1)+diff+1);
            op+=diff+1;
        }
          }
        }
        return op; 
    }
}