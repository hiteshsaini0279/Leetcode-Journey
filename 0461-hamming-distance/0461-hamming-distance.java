class Solution {
    public int hammingDistance(int x, int y) {
      String a =Integer.toBinaryString(x);
      String b=Integer.toBinaryString(y);
      int diff=Math.abs(a.length()-b.length());
      if(a.length()<b.length()){
        String s="";
        for(int i=0; i<diff; i++){
            s+='0';
        }
        a=s+a;
      }else{
          String s="";
        for(int i=0; i<diff; i++){
            s+='0';
        }
        b=s+b;
      }
    int ans=0;
    for(int i=0; i<a.length(); i++){
     if(a.charAt(i)!=b.charAt(i)){
      ans++;
     }
    }
    return ans;
    }
}