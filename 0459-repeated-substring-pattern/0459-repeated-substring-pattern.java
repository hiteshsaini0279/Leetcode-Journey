class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n=s.length();

       for(int i =1; i<n; i++){
         String str =s.substring(0,i);
        String e="";
        while(e.length()<n){
           e=e+str;
            if(e.equals(s)){
            return true;
        }
       }
    }
    return false;
}
}