class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, root);       
    }
    public static int dfs(TreeNode parent, TreeNode node){
        if(node == null) return 0;
        
        if(parent.val <= node.val){
            return 1 + (dfs(node, node.left) + dfs(node, node.right));
        }
        return (dfs(parent, node.left) + dfs(parent, node.right));
    } 
}