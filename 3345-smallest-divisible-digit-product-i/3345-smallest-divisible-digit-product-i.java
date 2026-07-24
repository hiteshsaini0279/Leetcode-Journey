class Solution {
    public static int product(int num){
        int prod=1;
        while(num>0){
            int last=num%10;
            prod=prod*last;
            num=num/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        for(int i=n; i<=100; i++){
            if(product(i)%t==0){
                return i;
            }
        }
        return -1;
    }
}