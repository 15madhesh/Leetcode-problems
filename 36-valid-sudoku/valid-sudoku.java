class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] box = new boolean[9][9];
        int a = 0, b = 0, i, j, rc;
        for (i = 0; i < 9; i++) {
            for (j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    a = board[i][j] - '0' - 1;
                    rc = (i / 3) * 3 + (j / 3);
                    if (row[i][a] || col[j][a] || box[rc][a]) {
                        return false;
                    }
                    row[i][a] = true;
                    col[j][a] = true;
                    box[rc][a] = true;
                }
            }
        }
        return true;
    }
}