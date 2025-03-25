class Solution {
    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean vis[][] = new boolean[image.length][image[0].length];
        Queue<Pair> que = new LinkedList<>();
        que.add(new Pair(sr, sc));

        if (image[sr][sc] == color)
            return image;

        int rowDir[] = { -1, 0, 0, 1 };
        int colDir[] = { 0, 1, -1, 0 };

        while (!que.isEmpty()) {
            int rowIndex = que.peek().first;
            int colIndex = que.peek().second;
            vis[rowIndex][colIndex] = true;
            que.poll();

            for (int i = 0; i < 4; i++) {
                int newRow = rowIndex + rowDir[i];
                int newCol = colIndex + colDir[i];

                if (newRow > -1 && newRow < image.length &&
                        newCol > -1 && newCol < image[0].length &&
                        image[sr][sc] == image[newRow][newCol] &&
                        vis[newRow][newCol] == false)
                {
                    image[newRow][newCol] = color;
                    que.add(new Pair(newRow, newCol));

                }
            }
        }
        image[sr][sc] = color;
        return image;
    }
}

class Pair {
    int first;
    int second;

    Pair(int row, int col) {
        this.first = row;
        this.second = col;
    }
}