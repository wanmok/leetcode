class Solution {

    // TODO (WanMok) find a solution that does not need two seperate loops.

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n / 2; j ++) {
                int t = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = t;
            }
        }
        for (int i = 0; i < n - 1; i ++) {
            for (int j = 0; j < n - 1 - i; j ++) {
                int t = matrix[n - 1 - j][n - 1 - i];
                matrix[n - 1 - j][n - 1 - i] = matrix[i][j];
                matrix[i][j] = t;
            }
        }
    }
}