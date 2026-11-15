class Solution {
    public String getHint(String secret, String guess) {
        int n=secret.length();
        int freq[]= new int[10];
        int bulls=0;
        int cows=0;
        for(int i=0; i<n; i++){
             freq[guess.charAt(i)-'0']++;
        }
        HashSet<Integer> idx= new HashSet<>();
        for(int i=0; i<n; i++){
           
            if(secret.charAt(i)==guess.charAt(i)){
             bulls++;
             idx.add(i);
      freq[secret.charAt(i)-'0']--;
            }
        }
      for(int i=0; i<n; i++){
           if(!idx.contains(i)&&freq[secret.charAt(i)-'0']>0){
            cows++;
             freq[secret.charAt(i)-'0']--;
           }
        }
        String ans=""+bulls;
        ans+='A';
        ans+=cows;
        ans+='B';
        return ans;
        
    }
}