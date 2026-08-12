class Solution {

    public int numberOfChild(int n, int k) {
int count=0;
    while(true){
        for(int i=0; i<n; i++){
            if(count==k){
                return i;
            }
            
                count++;
        }
         for(int i=n-2; i>0; i--){
            if(count==k){
                return i;
            }
           
                count++;
            
        }
    }

    }
}