class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int totalTime=arrivalTime+delayedTime;

        if(totalTime==24){
            return 0;
        }
if (totalTime > 24) {
    while (totalTime > 24) {
        totalTime = totalTime - 24;
    }
}
return totalTime;
    }
}