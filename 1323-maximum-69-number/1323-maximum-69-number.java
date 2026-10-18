class Solution {
    public int maximum69Number (int num) {
     String s=String.valueOf(num);
     String ans="";
     for(int i=0; i<s.length(); i++){
        if(s.charAt(i)-'0'==6){
            ans+='9';
           if(i+1<s.length()){
             String str=s.substring(i+1,s.length());
            ans+=str;
        break;
           }
        }else{
            ans+=s.charAt(i);
           }
     }
     int sol=Integer.parseInt(ans);
     return sol;
    }
}