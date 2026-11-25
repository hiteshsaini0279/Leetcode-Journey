class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        boolean ans[]= new boolean[n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!ans[j]&&fruits[i]<=baskets[j]){
                     ans[j] =true; 
                     break;    
                }
            }
        }
        int answer=0;
        for(int i=0; i<n; i++ ){
            if(!ans[i]){
                answer++;
            }
        }
        return answer;
    }
}