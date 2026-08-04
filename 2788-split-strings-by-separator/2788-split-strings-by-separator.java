import java.util.*;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
         List<String> ans= new ArrayList<>();
          String  str="";
          str+=separator;
         for(int i =0; i<words.size(); i++){
          
StringTokenizer st = new StringTokenizer(words.get(i),str);

while (st.hasMoreTokens()) {
  ans.add(st.nextToken());
}

         }
         return ans;
    }
}