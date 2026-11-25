class Solution {
    public int findChampion(int[][] grid) {
        int n=grid.length;
        int decision[]= new int[n];
        for(int i=0; i<n; i++){
            int count=0;
            for(int j=0; j<n; j++){
if(grid[i][j]==1){
  count++;
}
            }
            decision[i]=count;

        }
int ans=0;
int max=decision[0];
for(int i=1; i<n; i++){
if(decision[i]>max){
    ans=i;
    max=decision[i];
}
}
return ans;
    }
}