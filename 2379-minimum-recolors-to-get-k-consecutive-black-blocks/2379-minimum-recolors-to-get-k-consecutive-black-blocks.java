class Solution {
    public static  int operations(String s){
        int n=s.length();
        int count=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='W'){
                count++;
            }
        }
        return count;
    }
    public int minimumRecolors(String blocks, int k) {
        int n =blocks.length();
        if(n<k){
            return 0;
        }
ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i+k<=n; i++){
  String s=blocks.substring(i,i+k);
int val=operations(s);
list.add(val);
        }
        Collections.sort(list);
        return list.get(0);
    }
}