class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int acc = 0;
        
        if (n % 2 == 1)
            matrix[n / 2][n / 2] = n * n;
        
        for (int cycle_num = 0; cycle_num <= n / 2; cycle_num ++) {
            int interval = n - 2 * cycle_num - 1;
            for (int i = cycle_num, j = n - cycle_num - 1; i < n - cycle_num - 1; i ++, j --) {
                acc ++;
                matrix[cycle_num][i] = acc;
                matrix[i][n - cycle_num - 1] = acc + interval;
                matrix[n - cycle_num - 1][j] = acc + 2 * interval;
                matrix[j][cycle_num] = acc + 3 * interval;
            }
            acc += 3 * interval;
        }
        
        return (matrix);
    }
    
}