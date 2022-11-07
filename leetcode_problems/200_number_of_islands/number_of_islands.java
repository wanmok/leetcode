class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if (m == 0) return 0;
        int n = grid[0].length;
        if (n == 0) return 0;
        
        int count = 0;
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (grid[i][j] == '1') {
                    remove(grid, m - 1, n - 1, i, j);
                    count ++;
                }
            }
        }
        
        return count;
    }
    
    private void remove(char[][] grid, int m, int n, int x, int y) {
        if (grid[x][y] == '0') return ;
        
        grid[x][y] = '0';
        remove(grid, m, n, Math.max(x - 1, 0), y);
        remove(grid, m, n, Math.min(x + 1, m), y);
        remove(grid, m, n, x, Math.max(y - 1, 0));
        remove(grid, m, n, x, Math.min(y + 1, n));
    }
}