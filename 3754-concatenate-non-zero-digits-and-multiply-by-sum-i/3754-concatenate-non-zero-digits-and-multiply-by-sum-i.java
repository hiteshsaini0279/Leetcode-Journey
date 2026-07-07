class Solution {
    public static long  solve(int num){
       ArrayList<Integer> list= new ArrayList<>();
long sum=0;
long  ans=0;
       while(num>0){
        int last=num%10;
        if(last!=0){
          list.add(last);
          sum+=last;
        }
        num=num/10;
       }
       for(int i=list.size()-1; i>=0; i--){
        ans=ans*10+list.get(i);
       }
       return sum*ans;
    }

    public long sumAndMultiply(int n) {
        return  solve(n);
    }
}