import java.util.*;

class Solution {
    public String sortSentence(String s) {
        int n=s.length();
        StringTokenizer st= new StringTokenizer(s);
        ArrayList<String> list= new ArrayList<>();
        while(st.hasMoreTokens()){
            String s1=st.nextToken();
            list.add(s1);
        }
        String arrangedArr[]= new String[list.size()+1];
        for(int i=0; i<list.size(); i++){
            String str=list.get(i);
            int idx=str.charAt(str.length()-1)-'0';
            String org=str.substring(0,str.length()-1);
            arrangedArr[idx]=org;
        }
        String ans="";
        for(int i=1; i<arrangedArr.length; i++){
            ans+=arrangedArr[i];
            ans+=" ";
        }
        return ans.trim();
    }
}