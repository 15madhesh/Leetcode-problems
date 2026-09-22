class Solution {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] res = new int[m][n];
        for(int i = 0;i < m;i++){
            for(int j = 0;j < n;j++){
                int sum = 0;
                for(int r = 0;r < m;r++){
                    for(int c = 0;c < n;c++){
                        if(i - k <= r && r <= i+ k && j - k <= c && c <= j + k){
                            sum += mat[r][c];
                        }
                    }
                }
                res[i][j] = sum;
            }
        }
        return res;
    }
}