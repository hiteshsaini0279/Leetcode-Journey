class Solution {
    public int[] decimalRepresentation(int n) {
        String s= String.valueOf(n);
        int l=s.length();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<l; i++){
            int val= (int)((s.charAt(i)-'0')* Math.pow(10,l-i-1));
            if(val!=0){
                list.add(val);
            }
        }
        int ans[]= new int[list.size()];
        for(int i =0; i<list.size(); i++){
            ans[i]=list.get(i);
        }
        return ans;
    }
}