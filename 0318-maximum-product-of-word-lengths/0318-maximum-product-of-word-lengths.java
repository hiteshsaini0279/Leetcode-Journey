class Solution {
    public static boolean checker(  HashSet<Character> s1,HashSet<Character> s2){
for(char c:s1){
    if(s2.contains(c)){
        return false;
    }
}
return true;
        
    }
    public int maxProduct(String[] words) {
        int n=words.length;
        int ans=0;
        HashSet<Character> arr[]= new HashSet[n];
       for(int i=0; i<n; i++){
        HashSet<Character> set= new HashSet<>();
        for(int j=0; j<words[i].length(); j++){
           set.add(words[i].charAt(j)); 
        }
        arr[i]=set;
       }
for(int i=0; i<n; i++){
    for(int j=i+1; j<n; j++){
if(checker(arr[i],arr[j])){
    ans=Math.max(ans,words[i].length()*words[j].length());
}
    }
}
    return ans;
    }

}