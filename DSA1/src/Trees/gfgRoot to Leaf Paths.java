class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> ansList =  new ArrayList<>();
        ArrayList<Integer> tempList = new ArrayList<>();
        
        traverse(ansList, tempList, root);
        return ansList;
    }
    public static void traverse(ArrayList<ArrayList<Integer>> ansList, ArrayList<Integer> tempList ,Node node){
        if(node ==  null ){
            return;
        }
        tempList.add(node.data);
        traverse(ansList, tempList , node.left);
        traverse(ansList, tempList , node.right);
        if(node.left == null && node.right == null){
            ansList.add(new ArrayList<>(tempList));
        }
        tempList.remove(tempList.size() - 1);

    }
}
           
