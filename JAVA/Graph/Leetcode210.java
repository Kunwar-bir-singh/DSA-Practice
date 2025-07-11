class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        Queue<Integer> que = new LinkedList<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList());
        }

        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inDegree[prerequisites[i][0]]++;
        }

        for (int node = 0; node < numCourses; node++) {
            if (inDegree[node] == 0)
                que.add(node);
        }

        bfs(adj, ans, que, inDegree);

        if(ans.size() != numCourses) return new int [0];

        return ans.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void bfs(ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, Queue<Integer> que, int[] inDegree) {

        while (!que.isEmpty()) {
            int curr = que.poll();
            ans.add(curr);
            for (Integer neighbour : adj.get(curr)) {
                inDegree[neighbour]--;
                if (inDegree[neighbour] == 0)
                    que.add(neighbour);
            }
        }
    }
}