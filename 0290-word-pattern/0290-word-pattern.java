import java.util.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[]= new String[26];
    StringTokenizer st= new StringTokenizer(s);
ArrayList<String> list= new ArrayList<>();
while(st.hasMoreTokens()){
 list.add(st.nextToken());
}
if(list.size()!=pattern.length()){
    return false;
}
for(int i =0; i<list.size(); i++){
    if(arr['z'-pattern.charAt(i)] != null&&!list.get(i).equals(arr['z'-pattern.charAt(i)])){
        return false;
    }
    arr['z'-pattern.charAt(i)]=list.get(i);
}
for(int i=0; i<arr.length; i++){
    for(int j=i+1; j<arr.length; j++){
       if(arr[i] != null && arr[i].equals(arr[j])){
    return false;
}
    }
}
return true;
    }
}