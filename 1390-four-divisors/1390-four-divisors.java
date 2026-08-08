class Solution {
    public static int   divisors(int n){
        int ans=0;
        int count =0;
        int start=1;
       for (int i = 1; i * i <= n; i++) {
    if (n % i == 0) {
        int other = n / i;

        if (i == other) {
            ans += i;
            count++;
        } else {
            ans += i + other;
            count += 2;
        }
    }
}
        if(count!=4){
            return 0;
        }
        return ans;
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0; i<nums.length; i++){
         ans+=divisors(nums[i]);
        }
        return ans;
    }
}