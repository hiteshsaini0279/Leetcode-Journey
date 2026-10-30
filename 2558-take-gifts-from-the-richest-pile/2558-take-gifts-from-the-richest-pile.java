class Solution {
    public long pickGifts(int[] gifts, int k) {
        long ans=0;
        for(int i=0; i<k; i++){
            int idx=0;
            int max=0;
            for(int j=0; j<gifts.length; j++ ){
            if(max<gifts[j]){
                max=gifts[j];
                idx=j;
            }
            }
            gifts[idx]=(int)Math.sqrt(gifts[idx]);
        }
        for(int i =0; i<gifts.length; i++){
            ans+=(long)gifts[i];
        }
        return ans;
    }
}