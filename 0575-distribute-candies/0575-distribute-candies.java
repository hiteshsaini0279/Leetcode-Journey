class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set= new HashSet<>();
        int ans=candyType.length/2;
        for(int i=0; i<candyType.length; i++){
            set.add(candyType[i]);
        }
        if(set.size()<ans){
            return set.size();
        }
        return ans;
    }
}