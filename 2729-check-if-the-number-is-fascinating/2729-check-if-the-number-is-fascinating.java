class Solution {
    public static boolean numbers(int a ,int b ,int c){
        ArrayList<Integer> list = new ArrayList<>();
while(a>0){
int  val=a%10;
list.add(val);
a=a/10;
}
while(c>0){
int  val=c%10;
list.add(val);
c=c/10;
}
while(b>0){
int  val=b%10;
list.add(val);
b=b/10;
}
if (list.size()!=9){ return false;}

for(int i=1; i<=9; i++ ){
    if(!list.contains(i)){
        return false;
    }
}
return true;
    } 
    public boolean isFascinating(int n) {
      return numbers(n,2 * n,3*n) ; 
    }
}