class Solution {
    public long calculateScore(String[] instructions, int[] values) {
    int n=values.length;
    long score=0;
int i=0;
boolean visited[]= new boolean[n];
   while(i >= 0 && i < n && !visited[i]){
       
        if(instructions[i].equals("add")&&!visited[i]){
             score+=values[i];
              visited[i]=true;
             i++;
        }else{
             visited[i]=true;
            i+=values[i];
        }
    }
    return score;
    }
}