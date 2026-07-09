class Solution {
    public static boolean checkSubstring(String s){
       int n= s.length();
       boolean first= false;
       boolean second= false;
       boolean third= false;
       boolean fourth= false;
       boolean fifth= false;
                   
       for(int i =0; i<n; i++){
        if(s.charAt(i)=='a'){
            first= true;
        }else if(s.charAt(i)=='e'){
            second= true;
        }else if(s.charAt(i)=='u'){
            third= true;
        }else if(s.charAt(i)=='i'){
            fourth= true;
        } else if(s.charAt(i)=='o'){
            fifth= true;
        }else{
            return false;
        }
       }
         if(first&&second&&third&&fourth&&fifth){
            return true;
        }
       return false;
    }
    public int countVowelSubstrings(String word) {
        int n=word.length();
      int ans=0;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(checkSubstring(word.substring(i,j+1))){
                    ans++;
                }
            }
        }
        return ans;
    }
}