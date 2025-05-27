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
    static int i = 0 ;
    public TreeNode bstFromPreorder(int[] preorder) {
        i = 0;
        return helper(preorder, Integer.MAX_VALUE);
    }
    public static TreeNode helper(int[] arr, int max){
        if(i >= arr.length || arr[i] >= max) return null;

        TreeNode node = new TreeNode(arr[i++]);
        node.left  = helper(arr, node.val);
        node.right = helper(arr, max);

        return node;
    }
}