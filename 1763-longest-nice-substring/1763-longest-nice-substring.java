class Solution {
    public static  boolean  nice( String s){
            boolean check[] = new boolean[26];
      boolean check1[]= new boolean[26];
 HashSet<Character>  set= new  HashSet<>();
  for(char ch='a'; ch<='z'; ch++){
    set.add(ch);
  }
  for(int i =0; i<s.length(); i++){
    if(set.contains(s.charAt(i))){
        check[s.charAt(i)-'a']=true;
    }else{
           check1[s.charAt(i)-'A']=true;
    }
  }
  for(int i=0; i<26; i++){
    if(check[i]!=check1[i]){
        return false;
    }
  }
  return true;
    }
    public String longestNiceSubstring(String s) {
       String ans="";
       int max=Integer.MIN_VALUE;
 for(int i=0; i<s.length(); i++){
    for(int j=i; j<s.length(); j++){
  if( nice(s.substring(i,j+1))){
    if(max<j-i+1){
        ans=s.substring(i,j+1);
        max=j-i+1;
    }
  }
    }
 }
 return ans;
    }
}