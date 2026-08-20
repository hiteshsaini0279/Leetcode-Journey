class Solution {
    public int vowelConsonantScore(String s) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1=new HashSet<>();
        set.add('a'); set.add('e'); set.add('i'); set.add('o'); set.add('u');
        for(char ch='a'; ch<='z'; ch++){
            if(!set.contains(ch)){
                set1.add(ch);
            }
        } 
        int  v=0;
        int c=0;
      for(int i =0; i<s.length(); i++){
        if(set.contains(s.charAt(i))){
            v++;
        }
        if(set1.contains(s.charAt(i))){
            c++;
        }
      }
       if(c==0){
        return 0;
       }
       return v/c;
    }
}