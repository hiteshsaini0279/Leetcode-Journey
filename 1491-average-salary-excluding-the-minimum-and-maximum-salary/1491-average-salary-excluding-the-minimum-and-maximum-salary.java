class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
          double sum=0;
        for(int i=0; i<salary.length; i++){
            if(i==0|| i==salary.length-1){
                continue;
            }
            sum+=(double)salary[i];
        }
        double div= (double)salary.length-2;
        double ans=sum/div;
        return ans;
    }
}