class Solution {
   public static boolean before(String str) {
    return str.charAt(0) == '0';
}
    public static boolean  diffrence(String str){
int n=str.length();
int ones=0;
int zeros=0;
int count=0;
for(int i =1; i<n; i++){
if(str.charAt(i-1)!=str.charAt(i)){
count++;
}

}
for(int i=0; i<n; i++){
    if(str.charAt(i)-'0'==1){
        ones++;
    }else{
        zeros++;
    }
}
return count==1&& ones==zeros;
    } 
    public int findTheLongestBalancedSubstring(String s) {
        int n=s.length();
        int ans=0;
for(int i =0; i<n; i++){
    for(int j=i; j<n; j++){
        String str=s.substring(i,j+1);
        if(diffrence(str)){
if(before(str)){
    ans=Math.max(ans,str.length());
}
        }
    }
}

return ans;
    }
}