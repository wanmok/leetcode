class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int acc = 0;
        
        if (n % 2 == 1)
            matrix[n / 2][n / 2] = n * n;
        
        for (int cycle_num = 0; cycle_num <= n / 2; cycle_num ++) {
            int interval = n - 2 * cycle_num - 1;
            
            for (int i = cycle_num; i < n - cycle_num - 1; i ++) {
                acc ++;
                matrix[cycle_num][i] = acc;
                matrix[i][n - cycle_num - 1] = acc + interval;
            }
            acc += interval;
            for (int i = n - cycle_num - 1; i > cycle_num; i --) {
                acc ++;
                matrix[n - cycle_num - 1][i] = acc;
                matrix[i][cycle_num] = acc + interval;
            }
            acc += interval;
        }
        
        return (matrix);
    }
    
}