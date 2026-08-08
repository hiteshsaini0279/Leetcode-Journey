class Solution {
    public static boolean check( int val, int freq[],HashSet<Integer> set){
int f[]= new int[10];
while(val>0){
    int last=val%10;
    if(!set.contains(last)){
    return false;
    }
    f[last]++;
    val=val/10;
}
for(int i =0; i<freq.length; i++){
    if(f[i]>freq[i]){
        return false;
    }
}
return  true;
    }

    public int[] findEvenNumbers(int[] digits) {
        int n =digits.length;
        HashSet<Integer> set= new HashSet<>();
         HashSet<Integer> set1= new HashSet<>();
        int freq[]=  new int[10];
        for(int i =0; i<n; i++){
            set.add(digits[i]);
            freq[digits[i]]++;
        }
        int high=999;
        int start=100;
        while(start<=high){
            if(start%2==0&&check(start,freq,set)){
                set1.add(start);
            }
            start++;
        }
        int ans[]= new int[set1.size()];
        int idx=0;
  for(int num:set1){
    ans[idx++]=num;
  }
  Arrays.sort(ans);
  return ans;
    }
}