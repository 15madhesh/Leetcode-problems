class Solution {
    public int[] findDegrees(int[][] matrix) {
        int n = matrix.length;
        int[] mat = new int[n];
        for(int i = 0;i < n;i++){
            mat[i] = 0;
            for(int j = 0;j < n;j++){
                if(matrix[i][j] == 1){
                    mat[i]++;
                }
            }
        }
        return mat;
    }
}