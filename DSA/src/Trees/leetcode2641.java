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
    public static void traverse(Queue <TreeNode> que1, Queue <TreeNode> que2, HashMap<Integer , Integer> map, int level){
        if(que1.size() == 0) return;

        int sum = 0;
        while(!que1.isEmpty()){
            TreeNode node = que1.peek();

            if(node.left != null){
                que2.add(node.left);
            }
            if(node.right != null){
                que2.add(node.right);
            }
            TreeNode removedNode = que1.remove(); 
            sum += removedNode.val;
        }
        map.put(level, sum );
        traverse(que2, que1, map , level+1);
    }

    public static void cousinSum(TreeNode root, HashMap<Integer , Integer> map, int level ){

        if(root != null ){
            root.val = map.get(level) - root.val;

            if(root.left != null && root.right != null){
                int combSum = root.left.val + root.right.val; 
                root.left.val = root.right.val = combSum;
            }
        cousinSum(root.left, map, level + 1);
        cousinSum(root.right, map, level + 1);
        }
    }

    public TreeNode replaceValueInTree(TreeNode root) {
        if(root == null) return root ;
        
        HashMap<Integer , Integer> map = new HashMap<>();

        Queue <TreeNode> que1 = new LinkedList<>();
        Queue <TreeNode> que2 = new LinkedList<>();
        que1.add(root);

        traverse(que1, que2, map , 0);
        cousinSum(root, map, 0);

        return root;
    }
}