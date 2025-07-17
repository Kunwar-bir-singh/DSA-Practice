class Solution {
    public int minimumEffortPath(int[][] heights) {
        int n = heights.length;
        int m = heights[0].length;

        int [] row = {0, 1, -1, 0};
        int [] col = {1 ,0 ,0 ,-1};

        int[][] difference = new int[n][m];
        for(int diff[] : difference) Arrays.fill(diff, Integer.MAX_VALUE);

        PriorityQueue<int[]>que = new PriorityQueue<>((a,b) -> Integer.compare(a[2] , b[2]));

        que.add(new int[] {0, 0, 0});
        difference[0][0] = 0;

        while(!que.isEmpty()){
            int []pair = que.poll();

            int nodeRow = pair[0];
            int nodeCol = pair[1];
            int currDiff = pair[2];

            for(int dir = 0 ; dir < 4 ; dir++){
                int newRow = nodeRow + row[dir];
                int newCol = nodeCol + col[dir];

                if(newRow < n && newRow > -1 && newCol < m && newCol > -1 ){
                    int maxAbs = Math.abs(heights[nodeRow][nodeCol] - heights[newRow][newCol]);
                    int maxDiff = Math.max(maxAbs, currDiff);

                    if(difference[newRow][newCol] > maxDiff){
                        que.add(new int []{newRow, newCol, maxDiff });
                        difference[newRow][newCol] = maxDiff;
                    }
                }
            }
        }
        return difference[n- 1][m -1];
    }
}