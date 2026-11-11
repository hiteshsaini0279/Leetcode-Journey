class Solution {
    public static int  bitCount(String s){
        int n=s.length();
        int ans=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)-'0'==1){
                ans++;
            }
        }
        return ans;
    }
    public int numberOfBeams(String[] bank) {
        int n =bank.length;
int ans=0;
       ArrayList<Integer> laser= new ArrayList<>();
       for(int i=0; i<n; i++){
        int v=bitCount(bank[i]);
        if(v!=0){
        laser.add(v);
        }
       }
       if(laser.size()==1){
        return ans;
       }
       for(int i=0; i+1<laser.size(); i++){
        ans+=(laser.get(i)*laser.get(i+1));
       }
       return ans;
    }
}