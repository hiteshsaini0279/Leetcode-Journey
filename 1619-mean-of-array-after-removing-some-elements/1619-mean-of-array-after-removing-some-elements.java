class Solution {
    public double trimMean(int[] arr) {
        double sum=0.0;
        double count=0.0;
        Arrays.sort(arr);
        int start= (arr.length*5)/100;
        int end=arr.length-start;
for(int i=start; i<end; i++){
        sum+=(double)arr[i];
        count++;
}
return  sum/count;
    }
}