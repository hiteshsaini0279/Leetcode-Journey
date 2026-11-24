class Solution {
    public static boolean  anagram(String s,String s2){
        int n=s.length();
        int l=s2.length();
        int freq[]= new int[26];
         int freq2[]= new int[26];
        for(int i =0; i<n; i++){
freq[s.charAt(i)-'a']++;
        }
                for(int i =0; i<l; i++){
    freq2[s2.charAt(i)-'a']++;
        }
        for(int i =0; i<26; i++){
            if(freq[i]!=freq2[i]){
                return false;
            }
        }
        return true;
    }

    public List<String> removeAnagrams(String[] words) {
  ArrayList<String> answer = new ArrayList<>(Arrays.asList(words));
        boolean check=false;
       while(!check){
        boolean bp=false;
         for(int i=0; i+1<answer.size(); i++){
         if(anagram(answer.get(i),answer.get(i+1))){
            answer.remove(i+1);
            bp=true;
         }
        }
        if(bp==false){
            check=true;
        }

       }
        return answer;
    }
}