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
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList <>();
        Postorder(list, root);

        return list;
    }
    public static void  Postorder(List<Integer> list, TreeNode node){
        if (node == null) return;

        Postorder(list, node.left);
        Postorder(list, node.right);
        list.add(node.val);
    }
}