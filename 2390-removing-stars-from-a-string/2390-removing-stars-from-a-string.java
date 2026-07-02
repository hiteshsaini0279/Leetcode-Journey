class Solution {
    public String removeStars(String s) {
        HashSet<Character> set= new HashSet<>();
        char ch='a';
        for(int i=0; i<26; i++){
            set.add(ch++);
        }
        StringBuilder sb=new StringBuilder();
        for(int i =0; i<s.length(); i++){
           if(!set.contains(s.charAt(i))){
            sb.deleteCharAt(sb.length()-1);
           }else{
            sb.append(s.charAt(i));
           }
        }
        return sb.toString();
    }
}