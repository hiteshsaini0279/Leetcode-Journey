class Solution {
    public static  boolean check(String str){
    for(int i=0; i<str.length(); i++){
        for(int j=i+1; j<str.length(); j++){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
    }
    return true;
    }
    public boolean hasSpecialSubstring(String s, int k) {
        for(int i=0; i<=s.length()-k; i++){
         if (check(s.substring(i,i+k)) &&
    (i == 0 || s.charAt(i - 1) != s.charAt(i)) &&
    (i + k == s.length() || s.charAt(i + k) != s.charAt(i))) {
    return true;
}
         }
        
        return false;
    }
}