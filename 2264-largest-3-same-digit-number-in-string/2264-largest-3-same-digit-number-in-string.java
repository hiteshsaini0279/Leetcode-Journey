class Solution {
    public static boolean check(String s){
        return s.charAt(0)==s.charAt(1)&&s.charAt(1)==s.charAt(2);
    }
    public String largestGoodInteger(String num) {
     int n =num.length();
        int ans =0;
        String str="";
        for(int i=0; i+2<n; i++){
            if(check(num.substring(i,i+3))&&ans<=Integer.parseInt(num.substring(i,i+3))){
                ans=Integer.parseInt(num.substring(i,i+3));
                str=num.substring(i,i+3);
            }
        }
        return str;
    }
}