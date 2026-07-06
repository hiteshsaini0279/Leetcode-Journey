class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        int ans=0;
        int n=intervals.length;
        int l=intervals[0].length;
        ArrayList<ArrayList<Integer>>list= new ArrayList<>();

        for(int  i=0; i<n; i++){
      ArrayList<Integer> list1= new ArrayList<>();
      list1.add(intervals[i][0]);
      list1.add(intervals[i][1]);
      list.add(list1);
    }
    for(int i=0; i<list.size(); i++){
        int a=list.get(i).get(0);
           int b=list.get(i).get(1);
boolean covered=false;
             for(int j=0; j<list.size(); j++){
                if(i==j){
                    continue;
                }
                 int c=list.get(j).get(0);
                 int d=list.get(j).get(1);
                 if(c <= a&& b <= d){
                 covered =true; 
                 break;
                 }
             }
             if(covered){
                ans++;
             }

    }
    return n-ans;
}
}