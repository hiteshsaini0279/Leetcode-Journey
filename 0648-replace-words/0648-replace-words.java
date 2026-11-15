import java.util.*;
class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String ans="";
        List<String> list= new ArrayList<>();
StringTokenizer st = new StringTokenizer(sentence);

while(st.hasMoreTokens()){
    String word = st.nextToken();
    list.add(word);
}
for(int i=0; i<dictionary.size(); i++){
    String s=dictionary.get(i);
    for(int j=0; j<list.size(); j++){
        String str=list.get(j);
        if(str.startsWith(s)){
          list.set(j, s);
        }
    }
}
for(int i=0; i<list.size(); i++){
    ans+=list.get(i);
      ans+=" ";
}
return ans.trim();
    }
}