class Solution {
    public static boolean  solve(String s1,String s2){
          char solutionMat[][] = new char[8][8];

for(int i = 0; i < 8; i++) {
    for(int j = 0; j < 8; j++) {
        if(i % 2 == 0) {
            if(j % 2 == 0) {
                solutionMat[i][j] = 'b';
            } else {
                solutionMat[i][j] = 'w';
            }
        } else {
            if(j % 2 == 0) {
                solutionMat[i][j] = 'w';
            } else {
                solutionMat[i][j] = 'b';
            }
        }
    }
}
         return solutionMat[s1.charAt(0)-'a'][s1.charAt(1)-'1']==solutionMat[s2.charAt(0)-'a'][s2.charAt(1)-'1'];
    }
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
     return solve(coordinate1,coordinate2);
    }
}