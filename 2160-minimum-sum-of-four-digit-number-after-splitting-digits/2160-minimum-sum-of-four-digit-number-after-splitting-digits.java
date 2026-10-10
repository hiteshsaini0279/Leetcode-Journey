class Solution {
   
public int minimumSum(int num) {
    String text = String.valueOf(num);
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 0; i < text.length(); i++) {
        list.add(text.charAt(i) - '0');
    }

    Collections.sort(list);

    int num1 = list.get(0) * 10 + list.get(2);
    int num2 = list.get(1) * 10 + list.get(3);

    return num1 + num2;
}
}