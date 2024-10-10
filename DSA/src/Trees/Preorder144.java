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
    public List<Integer> preorderTraversal(TreeNode root) {
    List <Integer> list = new ArrayList <>();
        Preorder(list, root);

        return list;
    }
    public static void  Preorder(List<Integer> list, TreeNode node){
        if (node == null) return;

        list.add(node.val);
        Preorder(list, node.left);
        Preorder(list, node.right);
    }
}