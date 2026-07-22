class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
    int ans=0;
    int prefix[]= new int [arr.length];
    prefix[0]=arr[0];
     for(int i=1; i<arr.length; i++){
         prefix[i]=prefix[i-1]+arr[i];
     }
     for(int i=0; i<prefix.length; i++){
        for(int j=i; j<prefix.length; j++){
            if((j-i+1)%2==0){
                continue;
            }
        int curr= i==0? prefix[j]:prefix[j]-prefix[i-1];
        ans+=curr;
        }
     }
     return ans;
    }
}