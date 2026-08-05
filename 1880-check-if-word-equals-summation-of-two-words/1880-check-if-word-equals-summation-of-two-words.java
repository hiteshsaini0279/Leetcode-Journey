class Solution {
    public static int   countSum(String s, char arr[]){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<26; j++){
                if(s.charAt(i)==arr[j]){
                    list.add(j);
                    break;
                }
            }
        }
        int ans=0;
        for(int i =0; i<list.size(); i++){
            ans=ans*10+list.get(i);
        }
        return  ans;
    } 
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        int n=firstWord.length();
        int l=secondWord.length();
 char arr[]= new char[26];
 char ch='a';
  for(int i=0; i<26; i++){
  arr[i]= ch++;
  }
   boolean ans= countSum(firstWord,arr)+countSum(secondWord,arr)==countSum(targetWord,arr);
   return ans;
   
    }
}