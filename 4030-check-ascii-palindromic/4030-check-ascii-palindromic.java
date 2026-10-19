class Solution {
    public static boolean palindrome(String s){
        int start=0;
        int end=s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static  String  MakeTheString(int num){
        String binary = Integer.toBinaryString(num);
        if(binary.length()==8){
            return binary;
        }else{
            int neededZeros=8-binary.length();
            String ans="";
            for(int i=0; i<neededZeros; i++){
                ans+='0';
            }
            ans=ans+binary;
            return ans;
        }
    }
    public boolean isPalindromic(String s) {
        int n=s.length();
        String check="";
for(int i =0; i<n; i++){
    int val=(s.charAt(i)-'a')+97;
    String str=MakeTheString(val);
    check+=str;
}
return palindrome(check);
    }
}