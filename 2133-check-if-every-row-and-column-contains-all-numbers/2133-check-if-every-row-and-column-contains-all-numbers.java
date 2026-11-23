class Solution {
    public static boolean midchecker(boolean arr[]){
        int n=arr.length;
        for(int i=1; i<n; i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkValid(int[][] matrix) {
    int n=matrix.length;
    for(int i=0; i<n; i++){
        boolean arr[]= new boolean[n+1];
          boolean arr2[]= new boolean[n+1];
        for(int j=0; j<n; j++){
            arr[matrix[i][j]]=true;
             arr2[matrix[j][i]]=true;
        }
        if(!midchecker(arr)||!midchecker(arr2)){
            return false;
        }
    }
    return true;
    }
}