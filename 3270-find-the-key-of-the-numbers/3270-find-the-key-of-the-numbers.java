class Solution {
    public static String makeF(int num){
        String s=String.valueOf(num);
        int n=s.length();
            String str="";
        if(n<4){
            int diff=4-n;
            for(int i=0; i<diff; i++){
                str+=0;
            }
        }
        return str+s;
    }
    public int generateKey(int num1, int num2, int num3) {
        String s=makeF(num1);
        String s2=makeF(num2);
        String s3=makeF(num3);
        String ans="";
        for(int i=0; i<4; i++ ){
            int v=s.charAt(i)-'0';
             int v2=s2.charAt(i)-'0';
              int v3=s3.charAt(i)-'0';

ans+=Math.min(Math.min(v,v2),v3);
        }
        return Integer.parseInt(ans);
    }
}