class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double ans=0.0;
        for(int i=0; i<brackets.length; i++){
            if(i==0&& brackets[i][0]<income){
                ans+=(double)(brackets[i][0]*(brackets[i][1]/100.0));
            }else if(brackets[i][0]<income){
                 ans+=(double)((brackets[i][0]-brackets[i-1][0])*(brackets[i][1]/100.0));
            }else if(brackets[i][0]>=income){
                     if (i == 0) {
        ans += income * (brackets[i][1] / 100.0);
    } else {
        ans += (income - brackets[i-1][0]) * (brackets[i][1] / 100.0);
    }
    break;
            }
        }
        return ans; 

    }
}