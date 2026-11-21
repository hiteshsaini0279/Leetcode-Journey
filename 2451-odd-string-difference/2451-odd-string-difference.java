class Solution {
    public String oddString(String[] words) {
        ArrayList<ArrayList<Integer>> list= new ArrayList<>();
        String ans="";

        for(int i=0; i<words.length; i++){
            ArrayList<Integer> l= new ArrayList<>();
            for(int j=1; j<words[i].length(); j++){
                l.add(words[i].charAt(j)-words[i].charAt(j-1));
            }
            list.add(l);
        }
        for(int i =0; i<words.length; i++){
          int   count=1;
          for(int j=0; j<words.length; j++){
            if(i!=j&&list.get(i).equals(list.get(j))){
                count++;
            }
          }
          if(count==1){
            ans=words[i];
            break;
          }

        }
        return ans;
    }
}