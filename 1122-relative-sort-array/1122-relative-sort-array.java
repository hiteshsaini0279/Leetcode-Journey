class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[]= new int [arr1.length];
        ArrayList<Integer> list= new ArrayList<>();
   for (int i = 0; i < arr2.length; i++) {
    for (int j = 0; j < arr1.length; j++) {
        if (arr2[i] == arr1[j]) {
            list.add(arr1[j]);
        }
    }
}
        ArrayList<Integer> rem= new ArrayList<>();
for(int i=0; i<arr1.length; i++){
    if(!list.contains(arr1[i])){
        rem.add(arr1[i]);
    }
}
Collections.sort(rem);
for(int i =0; i<rem.size(); i++){
    list.add(rem.get(i));
}
for(int i=0; i<list.size(); i++){
    ans[i]=list.get(i);
}
return ans;
    }
}