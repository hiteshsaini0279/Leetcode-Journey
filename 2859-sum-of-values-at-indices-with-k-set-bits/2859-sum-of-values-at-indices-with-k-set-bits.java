class Solution {
    public static  boolean check(int n, int k){
        String s=Integer.toBinaryString(n);
    int count=0;
    for(int i =0; i<s.length(); i++){
        if(count>k){
            return false;
        }
        if(s.charAt(i)-'0'==1){
            count++;
        }
    }
    return count==k;
    }
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int n=nums.size();
       int ans=0;
        for(int i=0; i<n; i++){
            if(check(i,k)){
                ans+=nums.get(i);
            }
        }
        return ans;
    }
}