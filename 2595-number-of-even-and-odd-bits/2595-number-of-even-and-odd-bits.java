class Solution {
    public int[] evenOddBit(int n) {
        String str= Integer.toBinaryString(n);
        String s="";
        for(int i =str.length()-1; i>=0; i--){
            s+=str.charAt(i);
        }
        int even=0;
        int odd=0;
        for(int i=0; i<s.length(); i++){
  if(i%2==0&&s.charAt(i)-'0'==1){
    even++;
  }
   if(i%2!=0&&s.charAt(i)-'0'==1){
    odd++;
  }
        }
        int ans[]= new int [2];
        ans[0]=even;
        ans[1]=odd;
        return ans;
    }
}