class Solution {
       static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public int countBeautifulPairs(int[] nums) {
 int n=nums.length;
 int ans=0;
 for(int i=0;  i<n; i++){
    int first = nums[i];
while (first >= 10) {
    first /= 10;
}
    for(int j=i+1; j<n; j++){
        int last = nums[j] % 10;
  if(gcd(first,last)==1){
    ans++;
  }
    }
 }
 return ans;
    }
}