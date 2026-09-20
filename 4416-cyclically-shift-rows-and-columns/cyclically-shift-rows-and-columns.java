class Solution {
    public int[][] cyclicShift(int n, int[][] grid, int[] rowShift, int[] colShift) {
        int[][] res = new int[n][n];

        for (int i = 0; i < n; i++) {
            int rs = rowShift[i] % n;
            int k = 0;
            for (int j = rs; j < n; j++) {
                res[i][k++] = grid[i][j];
            }
            for (int j = 0; j < rs; j++) {
                res[i][k++] = grid[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = res[i][j];
            }
        }
        
        for (int j = 0; j < n; j++) {
            int cs = colShift[j] % n;
            int k = 0;
            for (int i = cs; i < n; i++) {
                res[k++][j] = grid[i][j];
            }
            for (int i = 0; i < cs; i++) {
                res[k++][j] = grid[i][j];
            }
        }
        return res;
    }
}