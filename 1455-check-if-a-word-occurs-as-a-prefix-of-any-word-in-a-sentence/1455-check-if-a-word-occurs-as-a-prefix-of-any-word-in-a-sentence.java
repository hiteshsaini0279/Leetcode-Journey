import java.util.*;
class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
   
      StringTokenizer st= new StringTokenizer(sentence);
ArrayList<String> list= new ArrayList<>();
      while(st.hasMoreTokens()){
          list.add(st.nextToken());
      }
 for(int i =0; i<list.size(); i++){
 if(list.get(i).startsWith(searchWord)){
return i+1;
 }
 }
  return -1;
}
}