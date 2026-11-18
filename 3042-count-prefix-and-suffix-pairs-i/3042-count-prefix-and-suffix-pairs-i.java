class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int n=words.length;
        int ans=0;
        for(int i=0; i<n; i++){
            String s=words[i];
            for(int j=i+1; j<n; j++){
                if(words[j].startsWith(s)&&words[j].endsWith(s)){
                    ans++;
                }
            }
        }
        return ans;
    }
}