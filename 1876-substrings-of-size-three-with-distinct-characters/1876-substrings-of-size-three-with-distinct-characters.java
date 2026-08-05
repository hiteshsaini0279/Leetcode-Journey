class Solution {
    public static boolean check(String s){
        boolean ans=false;
        if(s.charAt(0)!=s.charAt(1)&&s.charAt(1)!=s.charAt(2)&&s.charAt(0)!=s.charAt(2)){
        ans=true;
    }
    return ans;
    }
    public int countGoodSubstrings(String s) {
     int n=s.length();
     int count=0;
       for(int i =0; i+2<n; i++){
if(check(s.substring(i,i+3))){
    count++;
}
       }
       return count;
    }
}