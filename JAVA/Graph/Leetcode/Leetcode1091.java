class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int [] row = {-1 , -1 , 1, 0,  1,  1,  0, -1, };
        int [] col = { 0 , 1 ,  1, 1 , 0, -1, -1, -1, };

        int[][] distance = new int[n][m];
        for(int dis[] : distance) Arrays.fill(dis, Integer.MAX_VALUE);

        Queue<int[]>que = new LinkedList<>();

        if(grid[0][0] == 0) {
            distance[0][0] = 1;
            que.add(new int[] {0, 0, 1});
        }

        while(!que.isEmpty()){
            int []pair = que.poll();
            int nodeRow = pair[0];
            int nodeCol = pair[1];
            int currDistance = pair[2];

            for(int dir = 0 ; dir < 8 ; dir++){
                int newRow = nodeRow + row[dir];
                int newCol = nodeCol + col[dir];

                if(newRow < n && newRow > -1 && newCol < m && newCol > -1 && grid[newRow][newCol] == 0){
                    if( distance[newRow][newCol] > currDistance + 1){
                        que.add(new int []{newRow, newCol, currDistance + 1 });
                        distance[newRow][newCol] = currDistance + 1;
                    }
                }
            }
        }
        return distance[n- 1][m -1] == Integer.MAX_VALUE ? -1 : distance[n- 1][m -1];
    }
}