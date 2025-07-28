// User function Template for Java

class Solution {
    
    static int numProvinces(ArrayList<ArrayList<Integer>> adj, int V) {

        ArrayList<Integer> parent = new ArrayList<>();
        ArrayList<Integer> rank = new ArrayList<>();
        // code here
        int len = adj.size();
        int provinces = 0;
        
        
        for(int i = 0 ; i < len ; i++){
            rank.add(0);
            parent.add(i);
        }
        
        for(int i = 0 ; i < len ; i++){
            for(int j = 0 ; j < adj.get(i).size() ; j++){
                if(i != j && adj.get(i).get(j) == 1){
                    union(i, j, parent, rank);
                } 
            }
        }
        
        for(int i = 0 ; i < len ; i++){
            if (parent.get(i) == i) provinces++;
        }
        
        return provinces;
    }
    public static void union(int nodeA, int nodeB, ArrayList<Integer> parent, ArrayList<Integer> rank){
        int parentA = findParent(nodeA, parent);
        int parentB = findParent(nodeB, parent);
        
        if(parentA == parentB) return;
        if(rank.get(parentA) > rank.get(parentB) ){
            parent.set(parentB, parentA);
        }
        else if(rank.get(parentA) < rank.get(parentB) ){
            parent.set(parentA, parentB);
        }
        else {
            parent.set(parentB, parentA);
            int currRank = rank.get(parentA);
            rank.set(parentA, currRank + 1);
        }
    }
    public static int findParent(int node, ArrayList<Integer> parent){
        if(parent.get(node) == node) return node;
        
        int currParent = findParent(parent.get(node), parent);
        parent.set(node, currParent);
        
        return currParent;
    }
};w