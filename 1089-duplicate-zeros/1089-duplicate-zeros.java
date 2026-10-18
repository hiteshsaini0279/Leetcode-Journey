class Solution {
    public void duplicateZeros(int[] arr) {
        int n=arr.length;
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<n; i++){
            if(list.size()==n){
                break;
            }else if(arr[i]!=0){
                list.add(arr[i]);
            }else{
                list.add(0);
                list.add(0);
            }
        }
    for(int i=0; i<n; i++){
        arr[i]=list.get(i);
    }
    }
}