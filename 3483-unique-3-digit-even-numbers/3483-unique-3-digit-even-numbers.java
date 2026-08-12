class Solution {
    public static boolean  check ( int n,int freq[], HashSet<Integer> set){
        int f[]= new int[10];
       while(n>0){
        int last=n%10;
        f[last]++;
       if(!set.contains(last)){
       return  false;
       }
        n=n/10;
       }
       for(int i=0; i<10; i++){
        if(freq[i]<f[i]){
            return false;

        }
       }
return true;
    }
    public int totalNumbers(int[] digits) {
        int ans=0;
        int freq[]= new int[10];
        HashSet<Integer> set= new HashSet<>();
        for(int i=0; i<digits.length; i++){
            set.add(digits[i]);
            freq[digits[i]]++;
        }
for(int i=100; i<=999; i++){
    if(check(i,freq,set)&&i%2==0){
       ans++;
    }
}
return ans;
    }
}