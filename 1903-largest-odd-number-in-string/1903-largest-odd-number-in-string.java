class Solution {
    public String largestOddNumber(String num) {
        int n=num.length();
        String ans="";
        for(int i=n-1; i>=0; i--){
            int v=num.charAt(i)-'0';
            if(v%2!=0){
                String add=num.substring(0,i+1);
                ans+=add;
                break;
            }
        }
        return ans;
    }
}