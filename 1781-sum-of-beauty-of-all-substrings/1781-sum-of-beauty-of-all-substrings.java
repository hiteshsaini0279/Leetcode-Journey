class Solution {
   public static int beauty(String s) {
    int freq[] = new int[26];

    for(int i = 0; i < s.length(); i++) {
        freq[s.charAt(i)-'a']++;
    }

    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i = 0; i < 26; i++) {
        if(freq[i] > 0) {
            max = Math.max(max, freq[i]);
            min = Math.min(min, freq[i]);
        }
    }

    return max - min;
}
    public int beautySum(String s) {
        int ans=0;
        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length(); j++){
            String str=s.substring(i,j+1);
            ans+=beauty(str);
            }
        }
        return ans;
    }
}