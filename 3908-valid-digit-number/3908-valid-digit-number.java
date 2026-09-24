class Solution {
    public boolean validDigit(int n, int x) {    
String s = String.valueOf(n);
if(s.charAt(0)-'0'==x){
    return false;
}
boolean  answer= false;
for(int i =0; i<s.length(); i++){
    if(i!=0 && s.charAt(i)-'0'==x){
        answer=true;
        break;
    }
}
return answer;
    }
}