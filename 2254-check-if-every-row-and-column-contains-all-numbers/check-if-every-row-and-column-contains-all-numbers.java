class Solution {
    public boolean checkValid(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> rhs = new HashSet<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (rhs.contains(matrix[i][j])) {
                    return false;
                }
                rhs.add(matrix[i][j]);
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            HashSet<Integer> rhs = new HashSet<>();
            for (int j = 0; j < matrix[0].length; j++) {
                if (rhs.contains(matrix[j][i])) {
                    return false;
                }
                rhs.add(matrix[j][i]);
            }
        }
        return true;
    }
}