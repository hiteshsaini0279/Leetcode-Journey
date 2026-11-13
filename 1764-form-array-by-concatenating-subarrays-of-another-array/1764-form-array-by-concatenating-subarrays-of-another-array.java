class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int n = nums.length;

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for (int i = 0; i < groups.length; i++) {
            ArrayList<Integer> set = new ArrayList<>();

            for (int j = 0; j < groups[i].length; j++) {
                set.add(groups[i][j]);
            }

            list.add(set);
        }

        int start = 0;
        ArrayList<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {

            for (int j = start; j + list.get(i).size() <= n; j++) {

                ArrayList<Integer> set1 = new ArrayList<>();

                for (int k = j; k < j + list.get(i).size(); k++) {
                    set1.add(nums[k]);
                }

                if (list.get(i).equals(set1)) {
                    ans.add(true);
                    start = j + list.get(i).size();
                    break;
                }
            }
        }

        return ans.size() == groups.length;
    }
}