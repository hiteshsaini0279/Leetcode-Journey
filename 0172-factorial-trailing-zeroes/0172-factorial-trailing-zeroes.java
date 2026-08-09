class Solution {
    public static int trailingZer(int n){
        int count=0;
      while(n>0){
n=n/5;
count+=n;
      }
        return count;
    }
    public int trailingZeroes(int n) {
        return trailingZer(n);
    }
}