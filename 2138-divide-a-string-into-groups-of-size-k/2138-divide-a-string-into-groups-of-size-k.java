class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n =s.length();
        ArrayList<String> list= new ArrayList<>();
    if(n%k==0){
for(int i =0; i+k<=n; i+=k){
list.add(s.substring(i,i+k));
}
String ans[]= new String[list.size()];
 for(int i=0; i<list.size(); i++){
    ans[i]=list.get(i);
 }
 return ans;
    }
   while(s.length()%k!=0){
    s+=fill;
   }
   for(int i =0; i+k<=s.length(); i+=k){
list.add(s.substring(i,i+k));
}
String ans[]= new String[list.size()];
 for(int i=0; i<list.size(); i++){
    ans[i]=list.get(i);
 }
 return ans;
    }
}