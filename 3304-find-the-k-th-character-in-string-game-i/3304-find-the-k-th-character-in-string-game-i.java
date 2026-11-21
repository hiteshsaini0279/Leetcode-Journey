class Solution {
    public char kthCharacter(int k) {
        char arr[]= new char[26];
        for(char c='a'; c<='z'; c++){
            arr[c-'a']=c;
        }
        String ans="a";
        while(ans.length()<k){
            String add="";
            for(int i=0; i<ans.length(); i++){
                add+=arr[((ans.charAt(i)-'a')%26)+1];
            }
            ans=ans+add;
        }
        return ans.charAt(k-1);
    }
}