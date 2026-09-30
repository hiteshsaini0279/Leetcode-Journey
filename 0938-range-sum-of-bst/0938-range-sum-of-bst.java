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
    public static int  solve(TreeNode root, int low, int high, int ans){
            if(root==null){
                return ans;
            }
            if(low<=root.val && high>=root.val){
                ans+=root.val;
            }
     ans=solve(root.left,low,high,ans);
     ans=solve(root.right,low,high,ans);
        
        return ans;
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        int ans=0;
      return solve(root,low,high,ans);
    }
}