class Solution {
    public int[] minOperations(String boxes) {
        int n=boxes.length();
        int answer[]= new int[n];
ArrayList<Integer> list= new ArrayList<>();
for(int i =0; i<n; i++){
    if(boxes.charAt(i)-'0'==1){
        list.add(i);
    }
}
for(int i =0; i<n; i++){
    int op=0;
    for(int j=0; j<list.size(); j++){
        int diff=Math.abs(i-list.get(j));
        op+=diff;
    }
    answer[i]=op;
}
return answer;
    }
}