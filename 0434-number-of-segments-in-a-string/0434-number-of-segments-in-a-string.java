import java.util.*;
class Solution {
    public int countSegments(String s) {
        int count=0;
        int n= s.length();
   StringTokenizer st= new StringTokenizer(s);
    while(st.hasMoreTokens()){
        st.nextToken();
        count++;
    }
    return count;
    }
}