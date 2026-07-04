class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int start=0;
        int mat[][]= new int[n][n];
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                mat[i][j]=start++;
            }
        }
        int row=0;
        int col=0;
        for(int i =0; i<commands.size(); i++){
            if(commands.get(i).equals("UP")){
                row-=1;
            }else if(commands.get(i).equals("RIGHT")){
                col+=1;

            }else if(commands.get(i).equals("LEFT")){
                col-=1;
            }else{
                row+=1;
            }
        }

return mat[row][col];
    }
}