class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[][] acc = new int[m][n];
        
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                int left = j - 1 < 0 ? -1 : grid[i][j - 1];
                int up = i - 1 < 0 ? - 1 : grid[i - 1][j];
                grid[i][j] += left == -1 ? up == -1 ? 0 : up : up == -1 ? left : left > up ? up : left;
            }
        }
        
        return (grid[m - 1][n - 1]);
    }
}