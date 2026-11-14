class Solution {
    public String stringHash(String s, int k) {
        int n=s.length();
        String ans="";
        char arr[]= new char[26];
        char ch='a';
        for(int i=0; i<arr.length; i++){
            arr[i]=ch++;
        }
        for(int i=0; i+k-1<n; i+=k){
            int count=0; 
for(int j=i; j<i+k; j++){
    int val=s.charAt(j)-'a';
count+=val;
}
ans+=arr[count%26];
        }
        return ans;
    }
}