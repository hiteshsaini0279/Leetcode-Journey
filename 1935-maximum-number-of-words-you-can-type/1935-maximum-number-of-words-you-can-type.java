import java.util.*;
class Solution {
    public static  boolean check(String s, HashSet<Character> set){
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                return false;
            }
        }
        return  true;
    }
    public int canBeTypedWords(String text, String brokenLetters) {
        int ans=0;
        HashSet<Character> set = new HashSet<>();
        for(int i =0; i<brokenLetters.length(); i++){
            set.add(brokenLetters.charAt(i));
        }
StringTokenizer st = new StringTokenizer(text);



while (st.hasMoreTokens()) {
    String word = st.nextToken();
 if(check(word,set)){
ans++;
 }
}
return ans ;
    }
}