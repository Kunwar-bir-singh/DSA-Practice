import java.util.ArrayList;

public class DisjointSet {
    ArrayList<Integer> rank = new ArrayList<>();
    ArrayList<Integer> parent = new ArrayList<>();

    DisjointSet(int nodes){
        for(int i = 0 ; i < nodes ; i++){
            rank.add(0);
            parent.add(i);
        }
    }
    protected int findParent(int node){
        if(parent.get(node) == node) return node;

        int parentNode = findParent(parent.get(node));
        parent.set(node, parentNode);
        return parentNode;
    }
    protected void unionByRank(int node1, int node2){
        int parentNode1 = findParent(node1);
        int parentNode2 = findParent(node2);

        if(parentNode1 == parentNode2) return;

        if(rank.get(parentNode1) > rank.get(parentNode2)){
            parent.set(parentNode2, parentNode1);
        }
        else if(rank.get(parentNode2) > rank.get(parentNode1)){
            parent.set(parentNode1, parentNode2);
        }
        else {
            parent.set(parentNode2, parentNode1);
            int currRank = rank.get(parentNode1);
            rank.set(parentNode1, currRank + 1);

        }
        System.out.println("Parent : " + parent);
        System.out.println("Rank : " + rank);
    }
}
