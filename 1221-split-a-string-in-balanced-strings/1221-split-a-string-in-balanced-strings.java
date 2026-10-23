class Solution {

     public static boolean  balanced(String str){
        int n=str.length();
        int count=0;
        int count1=0;
        for(int i=0; i<n; i++){
            if(str.charAt(i)=='R'){
                count++;
            }else{
                count1++;
            }
        }
        return  count1==count;

     }
    public int balancedStringSplit(String s) {
        int ans=0;
        int l=s.length();
int j=0;
for(int i =0; i<l; i++){
    String str=s.substring(j,i);
    if(balanced(str)){
        ans++;
        j=i;
    }
}
return ans;
    }
}