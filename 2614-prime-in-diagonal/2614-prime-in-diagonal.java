class Solution {
  public static boolean prime(int num){
    if(num <= 1)
        return false;

    for(int i = 2; i * i <= num; i++){
        if(num % i == 0)
            return false;
    }

    return true;
}
    public int diagonalPrime(int[][] nums) {
        int x=0;
        int y=0;
        int cx=0;
        int cy=nums[0].length-1;
        int max=0;
        while(x<nums.length&&y<nums.length){
            if(prime(nums[x][y])){
            max= Math.max(max,nums[x][y]);
            }
                x++;
                y++;
            
        }
         while(cx<nums.length){
            if(prime(nums[cx][cy])){
            max= Math.max(max,nums[cx][cy]);
            }
                cx++;
            cy--;
            
        }
        return max;
    }
}