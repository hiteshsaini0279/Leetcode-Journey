
import java.util.*;

class Solution {

    public static boolean compare1(ArrayList<String> list, ArrayList<String> list1) {
        for (int i = 0; i < list.size(); i++) {
            int a = Integer.parseInt(list.get(i));
            int b = Integer.parseInt(list1.get(i));

            if (a < b) {
                return true;
            }
            if (a > b) {
                return false;
            }
        }
        return false;
    }

    public static boolean compare2(ArrayList<String> list, ArrayList<String> list1) {
        for (int i = 0; i < list.size(); i++) {
            int a = Integer.parseInt(list.get(i));
            int b = Integer.parseInt(list1.get(i));

            if (a > b) {
                return true;
            }
            if (a < b) {
                return false;
            }
        }
        return false;
    }

    public int compareVersion(String version1, String version2) {

        ArrayList<String> set = new ArrayList<>();
        ArrayList<String> set1 = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(version1, ".");
        StringTokenizer st1 = new StringTokenizer(version2, ".");

        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        while (st1.hasMoreTokens()) {
            set1.add(st1.nextToken());
        }

        int diff = Math.abs(set.size() - set1.size());

        if (set.size() < set1.size()) {
            for (int i = 0; i < diff; i++) {
                set.add("0");
            }
        } else {
            for (int i = 0; i < diff; i++) {
                set1.add("0");
            }
        }

        if (compare1(set, set1)) {
            return -1;
        } else if (compare2(set, set1)) {
            return 1;
        } else {
            return 0;
        }
    }
}
