/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static List<Integer>  solve(TreeNode root,List<Integer> ans ){
        if(root==null){
            return ans;
        }
        if(!ans.contains(root.val)){
            ans.add(root.val);
        }
       solve(root.left,ans);
       solve(root.right,ans);
       return ans;
    }
    public int findSecondMinimumValue(TreeNode root) {
      List<Integer> ans= new ArrayList<>();
      solve(root,ans);
      if(ans.size()==0||ans.size()==1){
        return -1;
      }
      Collections.sort(ans);
      return ans.get(1);
    }
}