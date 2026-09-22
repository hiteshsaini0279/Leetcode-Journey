class Solution {
    public boolean checkRecord(String s) {
    int n=s.length();
    int count=0;
  for(int i=0; i<n; i++){
    if(s.charAt(i)=='A'){
        count++;
    }
            if( i+2<n&&s.charAt(i)=='L'&&s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
            return false;
        }
    }
  if(count>=2){
    return false;
  }
    return true;
    }
}