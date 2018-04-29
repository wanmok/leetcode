class Solution {
    // the idea of reducing space complexity is to store the states
    // somewhere with its original matrix
    // recapping that game of life stores it in cells
    
    public void setZeroes(int[][] matrix) {
        boolean col_zero = false;
        int m = matrix.length, n = matrix[0].length;
        
        for (int i = 0; i < m; i ++) {
            if (matrix[i][0] == 0) col_zero = true;
            for (int j = 1; j < n; j ++)
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
        }
        
        // bottom-up approach is the key
        // don't override the information
        for (int i = m - 1; i >= 0; i --) {
            for (int j = n - 1; j > 0; j --)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col_zero) matrix[i][0] = 0;
        }
    }
}