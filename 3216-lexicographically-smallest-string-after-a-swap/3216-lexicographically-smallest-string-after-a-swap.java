class Solution {
    public String getSmallestString(String s) {
        int n=s.length();
        ArrayList<String> list= new ArrayList<>();
        list.add(s);
        String org=s;
        int i=0; 
        while(i+1<n){
            char arr[]=org.toCharArray();
        int v=arr[i]-'0';
          int v2=arr[i+1]-'0';
          if(v%2==0&&v2%2==0){
            char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }else if(v%2!=0&v2%2!=0){
             char temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
          }
 String str=new String(arr);
 list.add(str);
 i++;
        }
    String ans=list.get(0);
    for(int j=1; j<list.size(); j++){
if(list.get(j).compareTo(ans)<0){
    ans=list.get(j);
}
    }
    return ans;

    }
}