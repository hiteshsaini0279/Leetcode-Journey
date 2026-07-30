class Solution {
    public int minLength(String s) {
   Stack<Character> st= new Stack<>();
   
   for(int i =0; i<s.length(); i++){
  if(!st.isEmpty() &&s.charAt(i)=='B'&&st.peek()=='A'){
     st.pop();
     continue;
  }else if(!st.isEmpty() &&s.charAt(i)=='D'&&st.peek()=='C'){
     st.pop();
      continue;
  }
  st.push(s.charAt(i));
  
  
   }
   return st.size();
    }
}