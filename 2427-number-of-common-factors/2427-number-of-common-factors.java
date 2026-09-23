class Solution {
    public int commonFactors(int a, int b) {
        int range=Math.min(a,b);
        int ans=0;
        for(int i =1; i<=range; i++){
  if(a%i==0&& b%i==0){
    ans++;
  }
        }
        return ans;
    }
}