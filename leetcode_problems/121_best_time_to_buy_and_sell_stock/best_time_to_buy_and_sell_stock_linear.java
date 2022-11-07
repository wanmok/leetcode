class Solution {
    public int maxProfit(int[] prices) {
        for (int i = 0; i < prices.length - 1; i ++) {
            prices[i] = prices[i + 1] - prices[i];
        }
        
        int maxsofar = 0;
        int maxendinghere = 0;
        for (int i = 0; i < prices.length - 1; i ++) {
            int temp = maxendinghere + prices[i];
            maxendinghere = temp > 0 ? temp : 0;
            maxsofar = temp > maxsofar ? temp : maxsofar;
        }
        
        return (maxsofar);
    }
}