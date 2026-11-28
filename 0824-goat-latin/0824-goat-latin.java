import java.util.*;
class Solution {
    public static String goatLatin(String str,int idx){
        char first=str.charAt(0);
        HashSet<Character> set= new HashSet<>();
        set.add('a'); set.add('A');
         set.add('e'); set.add('E');
          set.add('i'); set.add('I');
           set.add('o'); set.add('O');
            set.add('u'); set.add('U');
if(set.contains(first)){
    int count=0;
    String s="ma";
    while(count<idx){
    s+='a';
    count++;
    }
    str=str+s;
    return str;
}

int count=0;
  String s="ma";
while(count<idx){
 s+='a';
 count++;
}
String ans=str.substring(1)+first+s;
return ans;
    }
    public String toGoatLatin(String sentence) {
        String ans="";
        ArrayList<String> list= new ArrayList<>();
           StringTokenizer st= new StringTokenizer(sentence);
           while(st.hasMoreTokens()){
            String str=st.nextToken();
            list.add(str);
           }
for(int i=0; i<list.size(); i++ ){
    String add=goatLatin(list.get(i),i+1)+" ";
    ans+=add;
}
return ans.trim();
    }
}