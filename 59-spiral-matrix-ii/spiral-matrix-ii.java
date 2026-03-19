class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int t = 0,l = 0;
        int b = n - 1;
        int r = n - 1;
        int nums = 1;
        while(t <= b && l <= r){
            for(int i = l;i <= r;i++){
                matrix[t][i] = nums++;
            }
            t++;
            for(int i = t;i <= b;i++){
                matrix[i][r] = nums++;
            }
            r--;
            if(t <= b){
                for(int i = r;i >= l;i--){
                    matrix[b][i] = nums++;
                }
                b--;
            }
            if(l <= r){
                for(int i = b;i >= t;i--){
                    matrix[i][l] = nums++;
                }
                l++;
            }
        }
        return matrix;
    }
}