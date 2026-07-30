class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int n  =points.length;
        int l=points[0].length;
        int min=Integer.MAX_VALUE;
        int idx=-1;
        for(int i =0; i<n; i++){
            for(int j=0; j<l; j++){
               if(x==points[i][0]||y==points[i][1]){
                  int curr=Math.abs(x-points[i][0])+Math.abs(y-points[i][1]);
                 if(curr<min){
                    min=curr;
                    idx=i;
                 }
               }
            }
        }
        return idx;
    }
}