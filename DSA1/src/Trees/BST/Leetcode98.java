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
class Leetcode98 {
    public boolean isValidBST(TreeNode root) {
        if(root == null) return true;
        return helper(root, Long.MAX_VALUE, Long.MIN_VALUE);
    }
    public static boolean helper(TreeNode root, Long max, Long min){
        if(root == null) return true;
        if((root.val >= max || root.val <= min)) return false;

        return helper(root.left, (long) root.val, min) && helper(root.right, max,(long) root.val);
    }
}