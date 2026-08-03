class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int ans=0;
  HashSet<Character>  set= new HashSet<>();
  set.add('a'); set.add('i'); set.add('e'); set.add('o'); set.add('u');
        for(int i=left; i<=right; i++){
              String s= words[i];
              if(set.contains(s.charAt(0))&&set.contains(s.charAt(s.length()-1))){
                ans++;
              }
        }

return ans;
    }
}