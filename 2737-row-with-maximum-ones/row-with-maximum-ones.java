class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] rs = new int[2];
        int max = 0;
        int idx = 0;
        for(int i = 0;i < mat.length;i++){
            int sum = 0;
            for(int j = 0;j < mat[0].length;j++){
                sum += mat[i][j];
            }
            if(max < sum){
                max = sum;
                idx = i;
            }
        }
        rs[0] = idx;
        rs[1] = max;
        return rs;
    }
}