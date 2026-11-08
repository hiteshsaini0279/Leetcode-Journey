class Solution {
    public String removeDigit(String number, char digit) {
        String ans="";
        ArrayList<Integer> digIdx= new ArrayList<>();
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)==digit){
                digIdx.add(i);
            }
        }
        for(int i=0; i<digIdx.size(); i++){
        
             String b=number.substring(0,digIdx.get(i))+number.substring(digIdx.get(i)+1,number.length());
 ans=(ans.compareTo(b)>0)?ans:b;
        } 
        return ans;
    }
}