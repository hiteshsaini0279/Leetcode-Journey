class Solution {
    public boolean queryString(String s, int n) {
        

        for(int i=1; i<=n; i++){
            String str= Integer.toString(i,2);
           if(!s.contains(str)){
           return false;
           }
        }
        return true;
    }
}