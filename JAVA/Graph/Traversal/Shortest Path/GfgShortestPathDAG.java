// User function Template for Java

class Pair{
    int node;
    int distance;
    
    Pair(int node, int distance){
        this.node = node;
        this.distance = distance;
    }
}

class Solution {

    public int[] shortestPath(int V, int E, int[][] edges) {
        Queue<Pair> que = new LinkedList<>();
        int [] dis = new int [V];
        
        Arrays.fill(dis, -1);
        
        que.add(new Pair(0, 0));
        dis[0] = 0;
        
        while(!que.isEmpty()){
            
            int currNode = que.peek().node;
            int currDistance = que.peek().distance;
            que.poll();
            
            for(int nodes[] : edges){
                if(nodes[0] == currNode){
                    
                    int nextDistance = nodes[2] + currDistance;
                    
                    if(dis[nodes[1]] == -1){
                        
                        dis[nodes[1]] = nextDistance;
                        que.add(new Pair(nodes[1], nextDistance));
                    }
                    else
                    if(dis[nodes[1]] >= nextDistance){
                        dis[nodes[1]] = nextDistance;
                        que.add(new Pair(nodes[1], nextDistance));
                    }
                        
                    }
                }
            }
        return dis;
        }
    }
    