class Solution {
    public static boolean  Testing(String s){
        int freq[]= new int[26];
        HashSet<Integer> set= new HashSet<>();

        for(int i=0; i<s.length(); i++ ){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++){
            if(freq[i]!=0){
                set.add(freq[i]);
            }
        }
        return set.size()==1;
    }
    public boolean equalFrequency(String word) {
        int n=word.length();
        for(int i=0; i<n; i++){
            String str=word.substring(0,i)+word.substring(i+1,n);
            if(Testing(str)){
                return true;
            }
        }
        return false;
    }
}