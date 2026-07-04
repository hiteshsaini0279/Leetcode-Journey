class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int maxCol[]= new int[matrix[0].length];
int ans[][]= new int[matrix.length][matrix[0].length];
 for(int j = 0; j < matrix[0].length; j++) {
    int max = 0;
    for(int i = 0; i < matrix.length; i++) {
        if(matrix[i][j] > max) {
            max = matrix[i][j];
        }
    }
    maxCol[j] = max;
}
 for(int i=0; i<matrix.length; i++){

        for(int j=0; j<matrix[0].length; j++ ){
    if(matrix[i][j] == -1){
    ans[i][j] = maxCol[j];
}else{
    ans[i][j] = matrix[i][j];
}
     }
    }
      return ans;
}
}