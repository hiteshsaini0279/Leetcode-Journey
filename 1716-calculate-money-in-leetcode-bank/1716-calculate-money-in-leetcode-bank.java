class Solution {
    public int totalMoney(int n) {
        int answer=0;
int count=0;
        for(int i=1; i<=n; i++){
            for(int j=i; j<i+7; j++){
                if(count==n){
                    return answer;
                }
  answer+=j;
  count++;
            }
        }
        return answer;
    }
}