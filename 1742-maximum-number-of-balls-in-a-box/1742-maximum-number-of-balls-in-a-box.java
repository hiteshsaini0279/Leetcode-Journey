class Solution {
  public static int total(int n){
    int ans=0;
    while(n>0){
        int last=n%10;
        ans+=last;
        n=n/10;
    }
    return ans;
  }
    public int countBalls(int lowLimit, int highLimit) {
        int arr[]= new int[highLimit+1];
        for(int i= lowLimit; i<=highLimit; i++){
            if(i>=10){
   arr[total(i)]++;
            }else{
   arr[i]++;
            }
        }
        int ans=0;
        for(int i=0; i<arr.length; i++){
            ans=Math.max(ans,arr[i]);
        }
        return ans;
    }
}