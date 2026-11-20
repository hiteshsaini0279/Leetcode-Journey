class Solution {
    public static String rev(String s){
int n=s.length();
String ans=""; 
for(int i =n-1; i>=0; i--){
    ans+=s.charAt(i);
}
return ans;
    }
    public boolean isSubstringPresent(String s) {
        int n=s.length();
        ArrayList<String> list= new ArrayList<>();
        for(int i=0; i+1<n; i++){
            String a="";
            a+=s.charAt(i);
             a+=s.charAt(i+1);
             list.add(a);
        }
        String check=rev(s);
        for(int i=0; i<list.size(); i++){
            if(check.contains(list.get(i))){
               return true;
            }
        }
        return false;
    }
}