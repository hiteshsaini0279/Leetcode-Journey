class Solution {
    public static boolean fnc(String s, int k){
        int count=0;
        int count1=0;

        for(int i=0; i<s.length(); i++){
         
            if(s.charAt(i)-'0'==0){
                count++;
            }else{
                count1++;
            }
               if(count > k && count1 > k){
                return false;
            }
        }
        return true;
    }
    public int countKConstraintSubstrings(String s, int k) {
        int n=s.length();
          int ans=0;
          for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(fnc(s.substring(i,j+1),k)){
                    ans++;
                }
            }
          }
          return ans;
    }
}