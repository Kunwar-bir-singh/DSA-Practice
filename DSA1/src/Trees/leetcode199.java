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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root == null) return list ;

        Queue <TreeNode> que1 = new LinkedList<>();
        Queue <TreeNode> que2 = new LinkedList<>();

        que1.add(root);
        traverse(list, que1, que2);

        return list;
    }
   public static void traverse(List<Integer> list, Queue <TreeNode> que1, Queue <TreeNode> que2){
        if(que1.size() == 0) return;

        TreeNode ansNode = que1.peek();

        list.add(ansNode.val);
        while(!que1.isEmpty()){
            TreeNode node = que1.peek();

            if(node.right != null){
                que2.add(node.right);
            }
            if(node.left != null){
                que2.add(node.left);
            }
            que1.remove(); 
        }
        traverse(list, que2, que1);
    }
}