class Solution {
    public static int  answer(int n){

        int ans=0;
        int  freq[]= new int[10];
        while(n>0){
            int last=n%10;
            freq[last]++;
            n=n/10;
        }
     for(int i=0; i<10; i++){
        ans+=(i*freq[i]);
     }
     return ans;
    }
    public int digitFrequencyScore(int n) {
      return answer(n); 
    }
}