class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n=score.length;
        String answer[]= new String[n];
        int newScore[]= score.clone();
        Arrays.sort(newScore);
        int idx=4;
        for(int i=n-1; i>=0; i--){
for(int j=0; j<n; j++){
if(newScore[i]==score[j]&&i==n-1){
answer[j]="Gold Medal";
}else if(newScore[i]==score[j]&&i==n-2){
    answer[j]="Silver Medal";
}else if(newScore[i]==score[j]&&i==n-3){
    answer[j]="Bronze Medal";
}else if(newScore[i]==score[j]){
    answer[j]=String.valueOf(idx++);
}
}
        }
        return answer;
    }
}