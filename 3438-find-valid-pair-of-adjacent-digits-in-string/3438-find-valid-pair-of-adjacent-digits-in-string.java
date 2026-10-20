class Solution {
    public String findValidPair(String s) {
        String ans="";
        int freq[]= new int[10];
        for(int i =0; i<s.length(); i++){
            freq[s.charAt(i)-'0']++;
        }
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                int f1=s.charAt(i)-'0';
                 int f2=s.charAt(i-1)-'0';
                if(f1==freq[f1]&&f2==freq[f2]){
                    ans+=s.charAt(i-1);
                    ans+=s.charAt(i);
                    break;
                }
            }
        }
        return ans;
    }
}