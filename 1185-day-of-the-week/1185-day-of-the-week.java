class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        if (month == 1) {
    month = 13;
    year--;
} else if (month == 2) {
    month = 14;
    year--;
}
    String ans[]= new String[7];
    int k=year%100;
    int j=year/100;

    ans[0]="Saturday";
      ans[1]="Sunday";
        ans[2]="Monday";
          ans[3]="Tuesday";
            ans[4]="Wednesday";
              ans[5]="Thursday";
                ans[6]="Friday";
                int h = (day + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
                return ans[h];
    }
}