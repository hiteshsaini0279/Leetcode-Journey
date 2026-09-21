class Solution {
        public boolean noZero(int num) {
      String s = String.valueOf(num);
       for(int i=0; i<s.length(); i++){
        if(s.charAt(i)-'0'==0){
            return false;
        }
       }
       return true;
    }
    public int[] getNoZeroIntegers(int n) {
  
        int ans[]= new int[2];
    for(int i=1; i<=n/2; i++){
        if(noZero(i)&&noZero(n-i)){
           ans[0]=i;
           ans[1]=n-i;
        }
    }
  
    return ans;
    }
}