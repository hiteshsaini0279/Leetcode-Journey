class Solution {
    public int maxRepeating(String sequence, String word) {
        int ans=0;
        String org=word;
        boolean c=false;
        while(sequence.contains(word)&&word.length()<=sequence.length()){
            
                c=true;
             word+=org;
            ans++; 
        
        
        }
        if(!c){
          return 0;
        }
        return ans;
    }
}