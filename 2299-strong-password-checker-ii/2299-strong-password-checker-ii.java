class Solution {
    public static boolean c1(String s){
    return s.length()>7;
}
    public static boolean c2(String s){
 HashSet<Character> set= new HashSet<>();
 for(char c='a'; c<='z'; c++){
    set.add(c);
 }
 for(int i=0; i<s.length(); i++){
    if(set.contains(s.charAt(i))){
        return true;
    }
 }
 return false;
}
    public static boolean c3(String s){
 HashSet<Character> set= new HashSet<>();
 for(char c='A'; c<='Z'; c++){
    set.add(c);
 }
 for(int i=0; i<s.length(); i++){
    if(set.contains(s.charAt(i))){
        return true;
    }
 }
 return false;
}
    public static boolean c4(String s){
HashSet<Integer> set= new HashSet<>();
for(int i=0; i<10; i++){
    set.add(i);
}
 for(int i=0; i<s.length(); i++){
    if(set.contains(s.charAt(i)-'0')){
        return true;
    }
 }
 return false;
}
    public static boolean c5(String s){
        String str="!@#$%^&*()-+";
         HashSet<Character> set= new HashSet<>();
         for(int i=0; i<str.length(); i++){
            set.add(str.charAt(i));
         }
for(int i=0; i<s.length(); i++){
    if(set.contains(s.charAt(i))){
        return true;
    }
 }
 return false;

}    
public static boolean c6(String s){
for(int i=1; i<s.length(); i++){
    if(s.charAt(i)==s.charAt(i-1)){
        return false;
    }
}
return true;
}

    public boolean strongPasswordCheckerII(String password) {
        return c1(password)&&c2(password)&&c3(password)&&c4(password)&&c5(password)&&c6(password);
    }
}