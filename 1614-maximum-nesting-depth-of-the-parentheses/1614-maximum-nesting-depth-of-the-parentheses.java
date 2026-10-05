class Solution {
    public int maxDepth(String s) {
        Stack<Character> st= new Stack<>();
        int n=s.length();
            int ans=0;
     for(int i=0; i<n; i++){
        if(s.charAt(i)=='('){
            st.push('(');
           ans=Math.max(ans,st.size());
        }else if(s.charAt(i)==')'){
            if(!st.isEmpty()){
                st.pop();
            }
        }
     }
     return ans;

    }
}



