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
    public long kthLargestLevelSum(TreeNode root, int k) {
        if(root == null) return 0;
        
        ArrayList <Long> sumList = new ArrayList<>();
        Queue<TreeNode> que1 = new LinkedList<>();
        Queue<TreeNode> que2 = new LinkedList<>();

        que1.add(root);
        traverse(que1, que2, k, sumList);
        Collections.sort(sumList);
        System.out.println(sumList);
        if(sumList.size()-k < 0) return -1;
        return sumList.get(sumList.size()-k);
    }
    public static void traverse(Queue<TreeNode> que1, Queue<TreeNode> que2, int k, ArrayList <Long> sumList){
        if(que1.size() == 0) return;
        
        long sum = 0;
        
        while(!que1.isEmpty()){
            TreeNode node = que1.peek();

            if(node.left != null){
                que2.add(node.left);
            }
            if(node.right != null){
                que2.add(node.right);
            }
            TreeNode removedNode = que1.remove(); 
            sum += removedNode.val ;
        }
        sumList.add(sum);
        traverse(que2, que1, k, sumList);
    }
}