class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int len = graph.length;
        List<Integer> ans = new ArrayList<>();

        boolean notSafeNodes[] = new boolean[len];
        boolean isVisited[] = new boolean[len];
        boolean recurVis[] = new boolean[len];

        for(int i = 0 ; i < len ; i++){
            if(!isVisited[i]){
                if(dfs(graph, notSafeNodes, isVisited, recurVis, i)) notSafeNodes[i] = true;   
            }
        }
        
        for(int i = 0 ; i < len ; i++){
            if(!notSafeNodes[i]) ans.add(i);
        }
        return ans;   
    }
    public static boolean dfs(int [][]graph, boolean notSafeNodes[], boolean isVisited[], boolean recurVis[], int node){
        isVisited[node] = true;
        recurVis[node] = true;

        for(int neighbour : graph[node]){
            if(!isVisited[neighbour]){
                if(dfs(graph, notSafeNodes, isVisited, recurVis, neighbour)){
                    notSafeNodes[neighbour] = true;
                    return true;
                }
            }
            else{
                if(recurVis[neighbour]){
                    return true;
                }
            }
        }
        recurVis[node] = false;
        return false;
    }
}