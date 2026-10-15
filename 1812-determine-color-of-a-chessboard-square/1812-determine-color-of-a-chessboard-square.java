class Solution {
    public boolean squareIsWhite(String coordinates) {
      char[][] chessBoard = {
    {'w','b','w','b','w','b','w','b'},
    {'b','w','b','w','b','w','b','w'},
    {'w','b','w','b','w','b','w','b'},
    {'b','w','b','w','b','w','b','w'},
    {'w','b','w','b','w','b','w','b'},
    {'b','w','b','w','b','w','b','w'},
    {'w','b','w','b','w','b','w','b'},
    {'b','w','b','w','b','w','b','w'}
};
        int v=coordinates.charAt(1)-'0';
    char c= chessBoard[Math.abs(v-8)][coordinates.charAt(0)-'a'];
    return c=='w';
    }
}