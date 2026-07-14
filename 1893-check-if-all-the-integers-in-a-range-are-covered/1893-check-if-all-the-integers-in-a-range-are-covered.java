class Solution {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int n=ranges.length;
while(left<=right){
    boolean isAvail=false;
    for(int i=0; i<n; i++){
        if(ranges[i][0]<=left&&left<=ranges[i][1]){
            isAvail=true;
            break;
        }
    }
    if(!isAvail){
        return false;
    }
    left++;
}

        return true;
    }
}