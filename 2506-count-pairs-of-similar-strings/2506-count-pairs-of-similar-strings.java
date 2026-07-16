class Solution {
    public int similarPairs(String[] words) {
        int n=words.length;
        int ans=0;
        for(int i=0; i<n; i++){
            String s=words[i];
TreeSet<Character> set = new TreeSet<>();
            for(int j=0; j<s.length(); j++){
              set.add(s.charAt(j));
            }
        
        
      for(int j=i+1; j<n; j++){
            String st=words[j];
TreeSet<Character> set1 = new TreeSet<>();
            for(int k=0; k<st.length(); k++){
              set1.add(st.charAt(k));
            }
       
            if(set.equals(set1)){
                ans++;
            }
        }

    }
    return ans;
    }
    }
