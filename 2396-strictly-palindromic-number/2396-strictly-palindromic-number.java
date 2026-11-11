class Solution {
    public static boolean palindrome(String s){
        int n=s.length();
        int start=0;
        int end=n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public boolean isStrictlyPalindromic(int n) {
       for(int i=2; i<=n-2; i++){
        String s=Integer.toString(n,i);
        if(!palindrome(s)){
            return false;
        }
       }
      
       return true;
    }
}