class Solution {
    public String removeDuplicates(String s) {
  boolean right=false; 
  ArrayList<Character> list= new ArrayList<>();
  for(int i =0; i<s.length(); i++){
  list.add(s.charAt(i));
  }
  while(!right){
    boolean check=true;
    for(int i=1; i<list.size(); i++){
        if(list.get(i)==list.get(i-1)){
            list.remove(i);
            list.remove(i-1);
            check=false;
            break;
        }
    }
    if(check){
        right=true;
    }
  }
  String str="";
  for(int i =0; i<list.size(); i++){
    str+=list.get(i);
  }
  return str;

    }
}