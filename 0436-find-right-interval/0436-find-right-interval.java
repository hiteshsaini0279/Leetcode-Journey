class Solution {
    public int[] findRightInterval(int[][] intervals) {
    
        int n=intervals.length;
int ans[]= new int[n];
        for(int i =0; i<n; i++){
            int val=-1;
            int check=Integer.MAX_VALUE;
            for(int j=0; j<n; j++){
                if( intervals[j][0]>=intervals[i][1]){
                  if(intervals[j][0]<check){
                    check=intervals[j][0];
                    val=j;
                  }  
                 
                }
            }
          ans[i]=val;
        }
        return ans;
    }
}