class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Dynamic Programming
    // @NOTE This problem has two approaches. DP will have larger space complexity and the other one will only take constant space. DP approach is quite straightforward.
    
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int[] memo = new int[prices.length];
        int maxProfit = 0;
        
        memo[0] = prices[0];
        for (int i = 1; i < prices.length; i ++) {
            maxProfit = Math.max(maxProfit, prices[i] - memo[i-1]);
            memo[i] = Math.min(memo[i-1], prices[i]);
        }
        
        return maxProfit;
    }
}