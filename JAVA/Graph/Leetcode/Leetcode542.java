class Cell{
    int row;
    int col;
    int dis;

    Cell(int row, int col, int dis){
        this.row = row;
        this.col = col;
        this.dis = dis;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        Queue<Cell> que = new LinkedList<>();
        boolean visited[][] = new boolean[m][n];
        int directions [][] = {{0, 1 , -1, 0 }, {1, 0, 0, -1}};

        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n ; j++){
                if(mat[i][j] == 0 ){
                    visited[i][j] = true;
                    que.add(new Cell(i, j, 0));
                }
            }   
        }
        
        while(!que.isEmpty()){
            Cell cell = que.poll();
            int currRow = cell.row;
            int currCol = cell.col;
            int currDis = cell.dis;

            for(int dir = 0 ; dir < 4 ; dir++){
                int newRow = currRow + directions[0][dir];
                int newCol = currCol + directions[1][dir];

                if(newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && !visited[newRow][newCol]){
                    visited[newRow][newCol] = true;
                    mat[newRow][newCol] = mat[newRow][newCol]  + currDis;
                    que.add(new Cell(newRow, newCol, mat[newRow][newCol] ));
                    
                }
            }    
        }
        return mat;
    }
}