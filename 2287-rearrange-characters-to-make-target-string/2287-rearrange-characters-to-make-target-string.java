class Solution {
    public int rearrangeCharacters(String s, String target) {
        int freq[]= new int [26];
          int f[]= new int [26];
          ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0; i<target.length(); i++){
            f[target.charAt(i)-'a']++;
        }
  for(int i=0; i<target.length(); i++){
     int ans= freq[target.charAt(i)-'a']/f[target.charAt(i)-'a'];
     list.add(ans);
        }
        Collections.sort(list);
    return list.get(0);
    }
}