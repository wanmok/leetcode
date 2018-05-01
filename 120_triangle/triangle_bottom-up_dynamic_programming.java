class Solution {
    // this is a more concise bottom-up dp solution
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0) return 0;
        if (triangle.get(0).size() == 0) return 0;
        
        Integer[] dp = triangle.get(n - 1).toArray(new Integer[n]);
        
        for (int i = n - 2; i >= 0; i --) {
            for (int j = 0; j <= i; j ++) {
                dp[j] = Math.min(dp[j], dp[j + 1]) + triangle.get(i).get(j);
            }
        }
        
        return dp[0];
    }
}