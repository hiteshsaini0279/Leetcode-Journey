class Solution {
    public int[] frequencySort(int[] nums) {
        int n =nums.length;
        int ans[]= new int[n];
        int idx=0;
         int freq[]= new int[201];
         for(int i =0; i<n; i++){
            if(nums[i]<0){
                freq[100-(nums[i])]++;
                continue;
            }
            freq[nums[i]]++;
         }
         int start=1;
         int end=100;
     while( start<=end){
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<freq.length; i++ ){
        if(freq[i]==start){
     if(i>100){
        list.add(100-i);
        continue;
     }
     list.add(i);
        }
        }
    Collections.sort(list);
    for(int i=list.size()-1; i>=0; i--){
        int f=0;
        while(f<start){
            ans[idx++]=list.get(i);
            f++;
        }
    }
        start++;  
    }
    return ans;
    }
}