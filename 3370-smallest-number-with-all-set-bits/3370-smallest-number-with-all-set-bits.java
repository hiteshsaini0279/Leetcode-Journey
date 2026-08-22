class Solution {
    public static boolean check(String s){
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='0'){
                return false;
            }
        }
        return true;
    }
    public int smallestNumber(int n) {
        for(int i=n; i<=2*n; i++){
            if(check(Integer.toBinaryString(i))){
                return i;
            }
        }
        return -1;
    }
}