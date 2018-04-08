class Solution {
    public int[][] generateMatrix(int n) {
        int[][] result = new int[n][n];
        solve(result, 0, 0);
        return (result);
    }
    
    private void solve(int[][] matrix, int cycle_num, int acc) {
        int len = matrix.length;
        if (cycle_num > len / 2) {
            if (len % 2 == 1)
                matrix[len / 2][len / 2] = acc + 1;
            return ;
        }
        
        for (int i = cycle_num; i < len - cycle_num - 1; i ++) {
            acc ++;
            matrix[cycle_num][i] = acc;
        }
        
        for (int i = cycle_num; i < len - cycle_num - 1; i ++) {
            acc ++;
            matrix[i][len - cycle_num - 1] = acc;
        }
        
        for (int i = len - cycle_num - 1; i > cycle_num; i --) {
            acc ++;
            matrix[len - cycle_num - 1][i] = acc;
        }
        
        for (int i = len - cycle_num - 1; i > cycle_num; i --) {
            acc ++;
            matrix[i][cycle_num] = acc;
        }
        
        solve(matrix, cycle_num + 1, acc);
    }
}