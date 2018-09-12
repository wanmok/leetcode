class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE This is a top-down approach. Think about a bottom-up approach?

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int n = obstacleGrid.length;
        if (n == 0) return 0;
        int m = obstacleGrid[0].length;
        if (m == 0) return 0;
        
        int[][] dp = new int[n][m];
        
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j ++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else {
                    if (i == 0 || j == 0) {
                        if (i == 0 && j != 0 && (dp[i][j - 1] == 0)) dp[i][j] = 0;
                        else if (j == 0 && i != 0 && dp[i - 1][j] == 0) dp[i][j] = 0;
                        else dp[i][j] = 1;
                    } else 
                        dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        
        return dp[n - 1][m - 1];
    }
}