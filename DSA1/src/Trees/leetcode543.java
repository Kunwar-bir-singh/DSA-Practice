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
    int max = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        calDiameter( root);
        return max; 
    }
    public int calDiameter(TreeNode root){
        if(root == null) return 0;

        int leftHeight = calDiameter(root.left);
        int rightHeight = calDiameter(root.right);

        max = Math.max(max , (leftHeight + rightHeight));

        return 1 + Math.max(leftHeight , rightHeight);
    }   
}