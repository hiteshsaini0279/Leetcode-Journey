class Solution {
    public static long  answer(long n){
        ArrayList<Long> list= new ArrayList<>();
         while(n>0){
            long last= n%10;
            if(last!=0){
                list.add(last);
            }
            n=n/10;
         }
         long ans=0;
         for(int i =list.size()-1; i>=0; i--){
         ans=ans*10+list.get(i);
         }
         return ans;
    }
    public long removeZeros(long n) {
        return answer(n);
    }
}