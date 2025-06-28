class Solution {
    int [] rowDir = {1, -1, 0, 0};
    int [] colDir = {0, 0, 1, -1};

    public int islandPerimeter(int[][] grid) {
        Queue<Pair> que = new LinkedList<>();
        boolean visited[][] = new boolean [grid.length][grid[0].length];

        for(int i = 0 ; i < grid.length ; i++){
            for(int j = 0 ; j < grid[0].length ; j++){
                if(grid[i][j] == 1){
                    return bfs(grid, visited, que, i, j);
                    
                }
            }
        }
        return 0;
    }   
    public int bfs(int [][]grid, boolean [][] visited, Queue<Pair> que, int row, int col){
        int ans = 0;
        que.add(new Pair(row, col));
        visited[row][col] = true;

        while(!que.isEmpty()){
            int currRow = que.peek().row;
            int currCol = que.peek().col;
            que.poll();

            for(int dir = 0 ; dir < 4 ; dir++){
                int newRow = currRow + rowDir[dir];
                int newCol = currCol + colDir[dir];

                if(newRow >= grid.length || newRow < 0 || newCol >= grid[0].length 
                || newCol < 0 || grid[newRow][newCol] == 0) ans++;
                else {
                    if(!visited[newRow][newCol]){
                        que.add(new Pair(newRow, newCol));
                        visited[newRow][newCol] = true;
                    }
                }
            }
        }
        return ans;
    }
}

class Pair{
    int row;
    int col;

    Pair(int row , int col){
        this.row = row;
        this.col = col;
    }
}