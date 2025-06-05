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
    public static void traverse(List<List<Integer>> list, Stack <TreeNode> stack1, Stack <TreeNode> stack2,boolean isSwitched ){
        if(stack1.size() == 0) return;

        List<Integer> tempList = new ArrayList<>();
        while(!stack1.isEmpty()){
            TreeNode node = stack1.peek();
            if(isSwitched){
                if(node.left != null){
                stack2.push(node.left);
                }
                if(node.right != null){
                stack2.push(node.right);
                }
            }
            else {
                if(node.right != null){
                stack2.push(node.right);
                }

                if(node.left != null){
                stack2.push(node.left);
                }
            }
            
            TreeNode removedNode = stack1.pop(); 
            tempList.add(removedNode.val);
        }
        list.add(tempList);
        isSwitched = !isSwitched;
        traverse(list, stack2, stack1, isSwitched );
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        boolean isSwitched  = true;
        List<List<Integer>> list = new ArrayList<>();

        if(root == null) return list ;

        Stack <TreeNode> stack1 = new Stack<>();
        Stack <TreeNode> stack2 = new Stack<>();

        stack1.push(root);
        traverse(list, stack1, stack2,isSwitched);
        return list;
    }
}