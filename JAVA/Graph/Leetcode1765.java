class Pair {
    int row;
    int col;

    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public int[][] highestPeak(int[][] isWater) {

        Queue<Pair> que = new LinkedList<>();

        boolean start[][] = new boolean[isWater.length][isWater[0].length];

        for (int i = 0; i < isWater.length; i++) {
            for (int j = 0; j < isWater[0].length; j++) {
                if (isWater[i][j] == 1) {
                    que.add(new Pair(i, j));
                    isWater[i][j] = 0;
                    start[i][j] = true;
                }
            }
        }

        return bfs(isWater, que, start);

    }

    public static int[][] bfs(int[][] isWater, Queue<Pair> que, boolean[][] start) {
        int directions[][] = { { 0, 1, -1, 0 },
                               { 1, 0, 0, -1 } };

        int height = 1;

        while (!que.isEmpty()) {
            int currLength = que.size();
            for (int i = 0; i < currLength; i++) {
                int currRow = que.peek().row;
                int currCol = que.peek().col;

                que.poll();

                for (int dir = 0; dir < 4; dir++) {
                    int newRow = currRow + directions[0][dir];
                    int newCol = currCol + directions[1][dir];

                    if (newRow >= 0 && newRow < isWater.length && newCol >= 0 && newCol < isWater[0].length
                            && start[newRow][newCol] == false && isWater[newRow][newCol] == 0) {
                        que.add(new Pair(newRow, newCol));
                        isWater[newRow][newCol] = height;
                    }
                }
            }
            height++;
        }
        return isWater;
    }
}