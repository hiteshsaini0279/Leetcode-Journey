class Solution {
    public static String swap(int i,int j, String str){
             char arr[]=str.toCharArray();
             char temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
            return new String(arr);
    }
    public static boolean checker(String s1,String s2){
         char arr[]=s1.toCharArray();
            char arr1[]=s2.toCharArray();
            Arrays.sort(arr);
            Arrays.sort(arr1);
            return Arrays.equals(arr,arr1);
    }
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
        int l=s2.length();
        if(n!=l){
            return false;
        }
        if(!checker(s1,s2)){
  return false;
        }
        for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                if(swap(i,j,s1).equals(s2)){
                    return true;
                }
            }
        }
         for(int i =0; i<n; i++){
            for(int j=i; j<n; j++){
                if(swap(i,j,s2).equals(s1)){
                    return true;
                }
            }
        }
        return false;
    }
}