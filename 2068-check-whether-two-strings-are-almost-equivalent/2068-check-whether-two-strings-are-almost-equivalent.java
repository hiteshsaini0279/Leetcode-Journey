class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int n=word1.length();
        int l=word2.length();
        int freq[]= new int[26];
       int f[]= new int[26];
       int decision[] =new int[26];
  for(int i=0; i<n; i++){
    freq[word1.charAt(i)-'a']++;
  } 
  for(int i=0; i<l; i++){
    f[word2.charAt(i)-'a']++;
  }
  for(int i=0; i<f.length; i++){
    decision[i]=Math.abs(freq[i]-f[i]);
  }
  for(int i=0; i<f.length; i++){
    if(decision[i]>3){
        return false;
    }
  }
  return true;

    }
}