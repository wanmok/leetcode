class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        
        for (int i = 0; i <= rowIndex; i ++) {
            dp[0] = 1;
            for (int j = i - 1; j > 0; j --) {
                dp[j] = dp[j - 1] + dp[j];
            }
            dp[i] = 1;
        }
        
        return (Arrays.asList(dp));
    }
}