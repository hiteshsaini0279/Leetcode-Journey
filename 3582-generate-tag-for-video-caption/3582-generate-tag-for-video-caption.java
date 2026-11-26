import java.util.*;

class Solution {
     public static String removecamelcaseConversion(String s){
        String ans = s.substring(0, 1).toLowerCase() + s.substring(1).toLowerCase();
        return ans;
    }
    public static String capitalized(String s){
        String ans = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        return ans;
    }
    public String generateTag(String caption) {
        StringTokenizer st= new StringTokenizer(caption);
        ArrayList<String> list= new ArrayList<>();
        while(st.hasMoreTokens()){
            String str=st.nextToken();
            list.add(str);
        }
        if (list.isEmpty()) {
    return "#";
}
        String ans="#";
        ans+=removecamelcaseConversion(list.get(0));
  for(int i=1; i<list.size(); i++ ){
    ans+=capitalized(list.get(i));
  }
return ans.substring(0, Math.min(ans.length(), 100));
    }
}