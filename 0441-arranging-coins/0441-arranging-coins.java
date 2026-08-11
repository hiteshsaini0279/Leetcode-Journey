class Solution {
    public int arrangeCoins(int n) {
int row=0;
while(row<=n){
    n=n-row;
    row++;
}
return row-1;
    }
}