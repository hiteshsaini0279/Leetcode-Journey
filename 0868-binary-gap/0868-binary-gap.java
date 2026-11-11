class Solution {
    public static int  dist(String s){
        int ans=0;
         for(int i =0; i<s.length(); i++){
           if(s.charAt(i)-'0'==1){
             for(int j=i+1; j<s.length(); j++){
                  if(s.charAt(j)-'0'==1){
                ans=Math.max(ans,j-i);
            break;
                  }
            }
           }
         }
         return ans;
    }
    public int binaryGap(int n) {
        String binary = Integer.toBinaryString(n);
        
        
        return dist(binary);
    }
}