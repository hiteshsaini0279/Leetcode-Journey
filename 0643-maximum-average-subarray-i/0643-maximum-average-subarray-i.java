class Solution {
    public double findMaxAverage(int[] nums, int k) {
    int n=nums.length;
    int prefix[]= new int[n];
    double div= (double) k;
    prefix[0]=nums[0];
for(int i=1;  i<n; i++){
prefix[i]=prefix[i-1]+nums[i];
}

        double max = Double.NEGATIVE_INFINITY;
for(int i=0; i<n; i++){
int j = i + k - 1;
if (j < n) {
    double sum = (i == 0) ? prefix[j] : prefix[j] - prefix[i - 1];
    max = Math.max(max, sum / k);
}

    
}
return max;

    }
}