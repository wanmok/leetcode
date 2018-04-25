class Solution {
    public List<Integer> getRow(int rowIndex) {
        Integer[] dp = new Integer[rowIndex + 1];
        
        int[] shared = new int[2];
        for (int i = 0; i <= rowIndex; i ++) {
            dp[0] = 1;
            shared[0] = 1;
            for (int j = 1; j < i; j ++) {
                shared[j % 2] = dp[j];
                dp[j] = shared[1 - j % 2] + dp[j];
            }
            dp[i] = 1;
        }
        
        return (Arrays.asList(dp));
    }
}