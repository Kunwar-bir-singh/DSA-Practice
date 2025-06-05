class Leetcode236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == root || q == root) return root;
        TreeNode nodeLeft = lowestCommonAncestor(root.left ,p, q);
        TreeNode nodeRight = lowestCommonAncestor(root.right,p, q);

        if(nodeLeft == null) return nodeRight;
        if(nodeRight == null) return nodeLeft;

        else return root;

    }
}