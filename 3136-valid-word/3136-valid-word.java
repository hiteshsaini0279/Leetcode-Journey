class Solution {

    public static boolean condition3(char arr[]) {
        HashSet<Character> set = new HashSet<>();
        HashSet<Character> set1 = new HashSet<>();

        set.add('a');
        set.add('i');
        set.add('e');
        set.add('o');
        set.add('u');

        set.add('A');
        set.add('I');
        set.add('E');
        set.add('O');
        set.add('U');

        int count = 0;
        int count1 = 0;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!set.contains(ch)) {
                set1.add(ch);
            }
        }

        for (char ch = 'A'; ch <= 'Z'; ch++) {
            if (!set.contains(ch)) {
                set1.add(ch);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                count++;
            }

            if (set1.contains(arr[i])) {
                count1++;
            }
        }

        return count >= 1 && count1 >= 1;
    }

    public static boolean condition2(char arr[]) {
        HashSet<Character> set = new HashSet<>();

        set.add('@');
        set.add('#');
        set.add('$');

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return false;
            }
        }

        return true;
    }

    public static boolean condition1(char arr[]) {
        return arr.length >= 3;
    }

    public boolean isValid(String word) {
        char arr[] = word.toCharArray();

        boolean ans = condition1(arr) &&
                      condition2(arr) &&
                      condition3(arr);

        return ans;
    }
}