class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Don't make the problem more complicated
    
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        
        int maxProfit = 0, minPrice = prices[0];
        for (int i = 0; i < prices.length; i ++) {
            minPrice = Math.min(prices[i], minPrice);
            maxProfit = Math.max(prices[i]-minPrice, maxProfit);
        }
        
        return maxProfit;
    }
}