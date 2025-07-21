// User function Template for Java

class Solution {

    int countDistinctIslands(int[][] grid) {
        // Your Code here
       int m = grid.length;
        int n = grid[0].length;

        HashSet<String> set = new HashSet<>();
        boolean[][] visited = new boolean[m][n];


        for(int i = 0 ; i < m ; i++ ){
            for(int j = 0 ; j < n ; j++ ){
                if(grid[i][j] == 1 && !visited[i][j]){
                    String oneWay = dfs(grid, visited, i, j, m, n, "C") ;
                    set.add(oneWay);
                }
            }
        }
        return set.size();
    }
    public static String dfs(int [][] grid, boolean [][] visited, int i, int j, int m, int n, String curr){
        
        if(i >= m || i < 0 || j >=n || j < 0 || grid[i][j] == 0 || visited[i][j]){
            return curr;
        }

        visited[i][j] = true;

        curr = dfs(grid, visited, i + 1, j, m, n, curr + "D");


        curr = dfs(grid, visited, i - 1, j , m, n, curr + "U");


        curr = dfs(grid, visited, i, j + 1, m, n, curr + "R");


        curr = dfs(grid, visited, i, j - 1, m, n, curr + "L");

        return curr;
    }
}
