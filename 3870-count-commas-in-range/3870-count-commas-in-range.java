class Solution {
    public static int  size(int n){
      if(n<1000){
        return 0;
      }else if(1000<=n&&n<=9999){
        return 4;
      }else if(10000<=n&&n<=99999){
        return 5;
      }else{
return 6;
      }
    }

   public static int val(int n){
    int res[]= new int[10];
    res[4]=1;
    res[5]=1;
    res[6]=1;
    res[7]=2;
    res[8]=3;
    res[9]=3;
    return res[n];
   }
    public int countCommas(int n) {
int ans=0;
for(int i =1; i<=n; i++){
int v=size(i);
 ans+=val(v);
}
return ans;
    }
}