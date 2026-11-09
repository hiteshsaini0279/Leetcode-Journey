class Solution {
    public int[] sortByBits(int[] arr) {
        int n=arr.length;
        Arrays.sort(arr);
    int ans[]= new int[n];
    int idx=0;
        for(int i=0; i<=16; i++){
            for(int j=0; j<n; j++){
       int count=Integer.bitCount(arr[j]);
       if(count==i){
        ans[idx++]=arr[j];
       }
            }
        }
        return ans;
    }
}