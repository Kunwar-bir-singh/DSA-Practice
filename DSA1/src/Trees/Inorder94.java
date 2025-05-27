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
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList <>();
        Inorder(list, root);

        return list;
    }

    public static void  Inorder(List<Integer> list, TreeNode node){
        if (node == null) return;

        Inorder(list, node.left);
        list.add(node.val);
        Inorder(list, node.right);
    }
}