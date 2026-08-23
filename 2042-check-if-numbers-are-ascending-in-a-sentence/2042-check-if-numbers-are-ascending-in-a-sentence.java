
import java.util.*;
class Solution {
    public boolean areNumbersAscending(String s) {
         int n= s.length();
 HashSet<Integer> set= new HashSet<>();
 for(int i=1; i<=100; i++){
    set.add(i);
 }
 ArrayList<Integer> list= new ArrayList<>();
StringTokenizer st = new StringTokenizer(s);
while(st.hasMoreTokens()){
    String word=st.nextToken();
    if (Character.isDigit(word.charAt(0))) {
        int num = Integer.parseInt(word);
       if(set.contains(num)){
        list.add(num);
    }
    }
}
   

if(list.size()==1){
    return true;
}
for(int i=1; i<list.size(); i++){
    if(list.get(i-1)>=list.get(i)){
        return false;
    }
}
return true;
    }
}