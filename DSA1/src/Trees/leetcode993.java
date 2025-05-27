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
    public boolean isCousins(TreeNode root, int x, int y) {
        int[][] arr = new int[2][2];
        traverse(arr, root.val, 0, x, y, root);
        if(arr[0][0] != arr[1][0] && arr[0][1] == arr[1][1]) return true;
        return false;
    }
    public static void traverse(int[][] arr, int parentVal, int level, int x, int y,TreeNode node){
        if(node == null) return;
        if(node.val == x){
            arr[0][0] = parentVal;
            arr[0][1] = level;
        }  
        else if(node.val == y) {
            arr[1][0] = parentVal;
            arr[1][1] = level;
        }

        traverse(arr, node.val, level+1, x, y, node.left);
        traverse(arr, node.val, level+1, x, y, node.right);
    }
}