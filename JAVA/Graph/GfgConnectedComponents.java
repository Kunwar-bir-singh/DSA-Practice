
class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        boolean visited[] = new boolean [V + 1];
        Queue<Integer> que = new LinkedList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i = 0 ; i < V ; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0 ; i < edges.length ; i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int index = 0;

        for(int i = 0 ; i < V ; i++){
            if(!visited[i]){

                visited[i] = true;
                que.add(i);
                ans.add(new ArrayList<>());
                ans.get(index).add(i);
                while(!que.isEmpty()){

                    int currElem = que.poll();

                    for(Integer itr : adj.get(currElem)){
                        if(!visited[itr]){
                            visited[itr] = true;
                            que.add(itr);
                            ans.get(index).add(itr);
                        }
                    }
                }
                index++;
            }
        }
        return ans;
    }
}