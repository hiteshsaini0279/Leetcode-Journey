class Solution {
    public int sumBase(int n, int k) {
        String s= Integer.toString(n,k);
        int ans=0;
        for(int i =0; i<s.length(); i++){
            int val=s.charAt(i)-'0';
            ans+=val;
        }
        return ans;
    }
}