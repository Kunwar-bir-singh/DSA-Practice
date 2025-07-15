class Pair{
    int node;
    int distance;
    
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
}
class Solution {
    // Function to find the shortest path from a source node to all other nodes
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        // code here
        Queue<Pair> que = new LinkedList<>();
        int [] dis = new int [adj.size()];
        
        Arrays.fill(dis, -1);
        
        que.add(new Pair(src, 0));
        dis[src] = 0;
        
        while(!que.isEmpty()){
            int curr = que.peek().node;
            int distance = que.peek().distance;
            que.poll();
            
            for(Integer neighbour : adj.get(curr)){
                if(dis[neighbour] == -1){
                    que.add(new Pair(neighbour , distance + 1));
                    dis[neighbour] = distance + 1;
                    }
            }
        }
        return dis;
    }
}
