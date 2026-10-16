
      import java.util.*;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
               ArrayList<String> set = new ArrayList<>();
            ArrayList<String>  set1 =  new ArrayList<>();
             StringTokenizer st = new StringTokenizer(s1," ");
             StringTokenizer st1 = new StringTokenizer(s2," ");

        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }
        
        while (st1.hasMoreTokens()) {
            set.add(st1.nextToken());
        }
     for(int i=0; i<set.size(); i++){
        String str1=set.get(i);
        int count=0;
        for(int j=0;  j<set.size(); j++){
              String str2=set.get(j);
              if(i!=j&&str1.equals(str2)){
                count++;
                break;
              }
        }
        if(count==0){
            set1.add(str1);
        }
     }
     String ans[]= new String[set1.size()];
     for(int i=0; i<set1.size(); i++){
        ans[i]=set1.get(i);
     }
      return ans; 
}  
    }
