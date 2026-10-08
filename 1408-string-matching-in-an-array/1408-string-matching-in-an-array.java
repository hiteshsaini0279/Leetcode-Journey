class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans= new ArrayList<>();
        HashSet<String> set= new HashSet<>();
        for(int i=0; i<words.length; i++){
            set.add(words[i]);
        }
        for(int i=0; i<words.length; i++){
            String s=words[i];
            int n=s.length();
            for(int k=0; k<n; k++){
                for(int j=k; j<n; j++){
                    String str=s.substring(k,j+1);
                    if(!ans.contains(str)&&str.length()!=n&&set.contains(str)){
                       ans.add(str);
                    }
                }
            }
    
        }
return ans;
    }

}