class Solution {
      public static int value2(String s){
     int n=s.length();
     int ans=0;
     for(int i=0; i<n; i++){
        if(s.charAt(i)-'0'==0){
          ans++;  
        }
     }
     return ans;
    }
    public static int value(String s){
     int n=s.length();
     int ans=0;
     for(int i=0; i<n; i++){
         if( s.charAt(i)-'0'==1){
          ans++;  
        }
     }
     return ans;
    }
    public int maxScore(String s) {
        int n=s.length();
        int answer=0;
      for(int i=1; i<n; i++){
        String s1=s.substring(0,i);
         String s2=s.substring(i,n);
         int f1=value2(s1);
         int f2=value(s2);
         int  f3=f1+f2;
         answer=Math.max(answer,f3);
      }
      return answer;
    }
}