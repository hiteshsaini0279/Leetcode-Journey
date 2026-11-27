class Solution {
    public int minDeletion(String s, int k) {
        int deletion=0;
        int n=s.length();
        int freq[]= new int[26];
        for(int i =0; i<n; i++){
            freq[s.charAt(i)-'a']++;
        }
        boolean perfectBreak=false;
        while(!perfectBreak){
            int distinct =0;
            for(int i=0; i<26; i++){
                if(freq[i]!=0){
                    distinct++;
                }
            }
            if(distinct<k){
              break;
            }
            if(distinct==k){
                return deletion;
            }
            int min=Integer.MAX_VALUE;
            int idx=0;
            for(int i=0; i<26; i++){
                if(freq[i]!=0&&freq[i]<min){
                    min=freq[i];
                    idx=i;
                }
            }
            if(min==Integer.MAX_VALUE){
                return deletion;
            }
            deletion+=freq[idx];
            freq[idx]=0;
        }
        return deletion;
    }
}