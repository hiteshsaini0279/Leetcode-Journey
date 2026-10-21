class Solution {
    public static int  digitCount(int num){
        int ans=0;
        String s=String.valueOf(num);
       for(int i =0; i<s.length(); i++){
      ans+=s.charAt(i)-'0';
       }
       return ans;
    }
    public int countLargestGroup(int n) {
        int ans=0;
        int  freq[]= new int[n+1];
        for(int i =1; i<=n; i++){
            int idx=digitCount(i);
   freq[idx]++;
        }
        int max=0;
        for(int i =0; i<freq.length; i++){
max=Math.max(max,freq[i]);
        }
          for(int i =0; i<freq.length; i++){
if(max==freq[i]){
    ans++;
}
        }
        return ans;
    }
}