class Solution
{
    //Function to check whether all nodes of a tree have the value 
    //equal to the sum of their child nodes.
    public static int isSumProperty(Node root)
    {
        boolean res = traverse(root);
        if(res) return 1;
        return 0;
        
    }
    public static boolean traverse(Node node){
        if(node == null) return true;
        
        if(node.left == null && node.right == null ) return true;
        
        int leftData = node.left == null ? 0 : node.left.data;
        int rightData = node.right == null ? 0 : node.right.data;
        
        if(leftData + rightData == node.data){
            return traverse(node.left) && traverse(node.right);
        }
        return false;
    }
}