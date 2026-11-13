class Solution {
    public String generateTheString(int n) {
        String ans="";
        ArrayList<Integer> list= new ArrayList<>();
        HashSet<Integer> set= new HashSet<>();
        list.add(0);
        set.add(0);
        for(int i=1; i<501; i++){
        if(i%2!=0){
            list.add(i);
            set.add(i);
        }
        }
        int val1=0;
        int val2=0; 
        int val3=0;
        for(int i=0; i<list.size(); i++){
            for(int j=i+1; j<list.size(); j++){
              int val= list.get(i)+list.get(j);
              if(set.contains((n-val))){
                val1=list.get(i);
                val2=list.get(j);
                val3=n-val;
              }
            }
        }
        int count=0;
        while(count<val1){
               ans+='x';
               count++;
        }
count=0;
        while(count<val2){
               ans+='y';
               count++;
        }
        count=0;
        while(count<val3){
               ans+='z';
               count++;
        }
        return ans;
    }
}