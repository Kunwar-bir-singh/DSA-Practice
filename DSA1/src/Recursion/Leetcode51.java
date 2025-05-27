class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ansList = new ArrayList<>();
        char getHit[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(getHit[i], '.');
        }

        helper(n, getHit, ansList, 0, 0);

        return ansList;
    }

    public static void helper(int n, char[][] getHit, List<List<String>> ansList, int row, int col) {
        if (col == n) {
            ansList.add(comb(getHit));
            return;
        }
        if (row == n)
            return;

        if (checkWest(getHit, row, col - 1) && checkNorthWest(getHit, row - 1, col - 1) && checkSouthWest(getHit, row + 1, col - 1)) {
                getHit[row][col] = 'Q';
                helper(n, getHit,  ansList, 0, col + 1);
                getHit[row][col] = '.';
        }
        helper(n, getHit,  ansList, row + 1, col);

    }

    public static boolean checkWest(char[][] getHit, int row, int col) {
        while (col > -1) {
            if (getHit[row][col] == 'Q')
                return false;
            col--;
        }
        return true;
    }

    public static boolean checkNorthWest(char[][] getHit, int row, int col) {
        while (row > -1 && col > -1) {
            if (getHit[row][col] == 'Q')
                return false;
            col--;
            row--;
        }
        return true;
    }

    public static boolean checkSouthWest(char[][] getHit, int row, int col) {
        while (row < getHit.length && col > -1) {
            if (getHit[row][col] == 'Q')
                return false;
            row++;
            col--;
        }
        return true;
    }

    public static List<String> comb(char[][] getHit) {
        List<String> currList = new ArrayList<>();
        for (int i = 0; i < getHit.length; i++) {
            String s = new String(getHit[i]);
            currList.add(s);
        }
        return currList;
    }
}