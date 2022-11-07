class Solution {
    public int numSquares(int n) {
        // the ability to abstract the algorithm needs to be improved...
        int[] dp = new int[n + 1];
        
        for (int i = 1; i <= n; i ++) {
            // j * j instead of Math.sqrt().... 
            dp[i] = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j ++) { 
                // the idea is very simple
                dp[i] = Math.min(dp[i], dp[i - j * j] + 1);
            }
        }
        
        return dp[n];
    }
}