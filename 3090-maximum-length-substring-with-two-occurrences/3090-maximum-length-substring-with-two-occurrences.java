class Solution {
    public static boolean check (String s){
        int n=s.length();
        int freq[]=new int [26];
        for(int i=0; i<n; i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<26; i++ ){
            if(freq[i]>2){
                return false;
            }
        }
        return true;
    }
    public int maximumLengthSubstring(String s) {
        int n=s.length();
        int max=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(check(s.substring(i,j+1))){
                    max= Math.max(max, j-i+1);
                }
            }
        }
        return max;
    }
}
