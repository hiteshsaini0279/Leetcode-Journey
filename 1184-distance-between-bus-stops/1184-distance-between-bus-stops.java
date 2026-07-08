class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if(start>destination){
            int temp=start;
            start=destination;
            destination=temp;
        }
        int  n= distance.length;
        int clockwise=0;
        int total=0;
for(int i=0; i<n;i++){
    total+=distance[i];
    if(start<=i&&i<destination){
        clockwise+=distance[i];
    }
}
return Math.min(clockwise,total-clockwise);

    }
}