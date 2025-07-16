class Pair {
    int row;
    int col;
    Pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {
    public void solve(char[][] board) {
        if (board.length == 0 || board[0].length == 0) return;

        int m = board.length, n = board[0].length;
        Queue<Pair> queue = new LinkedList<>();

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') queue.add(new Pair(i, 0));
            if (board[i][n - 1] == 'O') queue.add(new Pair(i, n - 1));
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') queue.add(new Pair(0, j));
            if (board[m - 1][j] == 'O') queue.add(new Pair(m - 1, j));
        }

        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            Pair curr = queue.poll();
            int r = curr.row, c = curr.col;

            if (r < 0 || r >= m || c < 0 || c >= n || board[r][c] != 'O') continue;

            board[r][c] = '#'; 

            for (int[] dir : directions) {
                queue.add(new Pair(r + dir[0], c + dir[1]));
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';      
                else if (board[i][j] == '#') board[i][j] = 'O'; 
            }
        }
    }
}
