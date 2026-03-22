class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0;i < n;i++){
            for(int j = i  + 1;j < n;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = t;
            }
        }
        
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n / 2;j++){
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = t;
            }
        }
    }
    public boolean equal(int[][] mat, int[][] target) {
        for(int i = 0;i < mat.length;i++){
            for(int j = 0;j < mat[0].length;j++){
                if(mat[i][j] != target[i][j]){
                    return false;
                }
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i = 0;i < 4;i++){
            if(equal(mat,target)){
                return true;
            }
            rotate(mat);
        }
        return false;
    }
}