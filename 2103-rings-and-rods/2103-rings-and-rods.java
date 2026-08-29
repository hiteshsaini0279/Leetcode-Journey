class Solution {
    public int countPoints(String rings) {
        int count=0;
 ArrayList<Character> r0= new ArrayList<>();
ArrayList<Character> r1= new ArrayList<>();
 ArrayList<Character> r2= new ArrayList<>();
 ArrayList<Character> r3= new ArrayList<>();
  ArrayList<Character> r4= new ArrayList<>();
    ArrayList<Character> r5= new ArrayList<>(); 
 ArrayList<Character> r6= new ArrayList<>();
   ArrayList<Character> r7= new ArrayList<>();
    ArrayList<Character> r8= new ArrayList<>();
  ArrayList<Character> r9= new ArrayList<>();


for(int i =0; i<rings.length(); i+=2){
    if(rings.charAt(i+1)-'0'==0){
        r0.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==1){
        r1.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==2){
        r2.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==3){
        r3.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==4){
        r4.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==5){
        r5.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==6){
        r6.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==7){
        r7.add(rings.charAt(i));
    }else if(rings.charAt(i+1)-'0'==8){
        r8.add(rings.charAt(i));
    }else {
        r9.add(rings.charAt(i));
    }
}
if(r0.contains('R')&&r0.contains('G')&&r0.contains('B')){
    count++;
}
if(r2.contains('R')&&r2.contains('G')&&r2.contains('B')){
    count++;
}if(r3.contains('R')&&r3.contains('G')&&r3.contains('B')){
    count++;
}if(r4.contains('R')&&r4.contains('G')&&r4.contains('B')){
    count++;
}
if(r5.contains('R')&&r5.contains('G')&&r5.contains('B')){
    count++;
}if(r6.contains('R')&&r6.contains('G')&&r6.contains('B')){
    count++;
}
if(r7.contains('R')&&r7.contains('G')&&r7.contains('B')){
    count++;
}
if(r8.contains('R')&&r8.contains('G')&&r8.contains('B')){
    count++;
}
if(r9.contains('R')&&r9.contains('G')&&r9.contains('B')){
    count++;
}
if(r1.contains('R')&&r1.contains('G')&&r1.contains('B')){
    count++;
}

return count;
    }
}