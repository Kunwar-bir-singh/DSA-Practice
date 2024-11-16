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
class Leetcode230 {
    public int kthSmallest(TreeNode root, int k) {
        int[] counter = new int[1];
        int [] ans = new int[1];
        inorder(root, k, ans, counter );

        return ans[0];
    }
    public static void inorder(TreeNode root, int k , int[] ans, int[] counter ){
        if(root == null) return;
        inorder(root.left, k ,ans, counter );
        if(counter[0] < k) {
            counter[0]++;
            ans[0] = root.val;

        }
        if(counter[0] == k ) {
            return;
        }
        inorder(root.right, k ,ans, counter );
    }
}