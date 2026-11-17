class Solution {
    public static boolean palin(String s){
        int n=s.length();
        int start=0;
        int end=n-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public int countSubstrings(String s) {
        int n=s.length();
        int ans=0;
        ArrayList<String> list= new ArrayList<>();
        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                list.add(s.substring(i,j+1));
            }
        }
        for(int i=0; i<list.size(); i++){
            if(palin(list.get(i))){
ans++;
            }
        }
        return ans;
    }
}