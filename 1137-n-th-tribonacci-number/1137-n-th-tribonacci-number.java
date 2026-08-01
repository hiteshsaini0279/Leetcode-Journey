class Solution {
    public int tribonacci(int n) {
        int trio[]= new int[n+1];
        if(n==0){
            return 0;
        }
if(n==1||n==2){
    return 1;
}
      if(n>2){
          trio[0]=0;
        trio[1]=1;
        trio[2]=1;
      }
        for(int i=3; i<=n; i++){
            trio[i]=trio[i-1]+trio[i-2]+trio[i-3];
        }
        return trio[n];
    }
}