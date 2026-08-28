class Solution {
    public static boolean  check(String s,  int freq[]){
                  int f[]= new int[26];

          for(int i=0; i<s.length(); i++){
            f[s.charAt(i)-'a']++;
          }
          for(int i =0; i<26; i++){
            if(f[i]>freq[i]){
                return false;
            }
          }
          return true;
    }
    public int countCharacters(String[] words, String chars) {
        int ans=0;
          int freq[]= new int [26];

          for(int i=0; i<chars.length(); i++){
            freq[chars.charAt(i)-'a']++;
          }
          for(int i=0; i<words.length; i++){
            if(check(words[i],freq)){
                ans+=words[i].length();
            }
          }
          return ans;  
    }
}