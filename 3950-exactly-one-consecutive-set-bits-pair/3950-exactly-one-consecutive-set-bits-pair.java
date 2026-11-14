class Solution {
    public boolean consecutiveSetBits(int n) {
        String s=Integer.toString(n,2);
        int count=0;
        for(int i=1; i<s.length(); i++){
            if(s.charAt(i)-'0'==1&&s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
        return count==1;
    }
}