class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int n=words.length;
String str="";
        for(int i=0; i<n; i++){
            str+=words[i];
if(s.equals(str)){
    return true;
}
if(s.length()<str.length()){
    break;
}
        }
        return  false;
    }
}