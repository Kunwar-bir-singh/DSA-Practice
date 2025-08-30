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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null || subRoot == null) return false;
        
        if(root.val == subRoot.val) {
            if(isSameTree(root, subRoot))
                return true;
        } 
        
        return(isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot));
    } 
    public boolean isSameTree(TreeNode a, TreeNode b){
        if(a == null || b == null) return a == b;
        
        if(a.val == b.val) return(isSameTree(a.left, b.left) && isSameTree(a.right, b.right) );
        
        return false;
    }  
}