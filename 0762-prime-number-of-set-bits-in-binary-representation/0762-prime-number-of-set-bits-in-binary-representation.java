class Solution {
    public static boolean isprime(int n){
        if(n==1){
            return false;
        }
        if(n==2||n==3){
            return true;
        }
        for(int i=2; i<=n/2; i++ ){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean  setPrime(String s){
        int ans=0;
         for(int i=0; i<s.length(); i++){
              if(s.charAt(i)-'0'==1){
                ans++;
              } 
         }
         return isprime(ans);
    }
    public int countPrimeSetBits(int left, int right) {
        int ans=0;
        for(int i=left; i<=right; i++){
            String binary = Integer.toBinaryString(i);
            if(setPrime(binary)){
               ans++;
            }

        }
        return ans;
    }
}