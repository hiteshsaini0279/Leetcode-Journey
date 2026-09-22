class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        while(n>2){
            String str="";
            for(int i=0; i+1<n; i++){
                str+=((s.charAt(i)-'0'+s.charAt(i+1)-'0'))%10;
            }
             s=str;
            n=str.length();
        }
        return s.charAt(0)==s.charAt(1);
    }
}