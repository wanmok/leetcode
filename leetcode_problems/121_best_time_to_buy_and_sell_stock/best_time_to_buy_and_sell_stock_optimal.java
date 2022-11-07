class Solution {
    public int maxProfit(int[] prices) {    
        int maxsofar = 0;
        int maxendinghere = 0;
        for (int i = 0; i < prices.length - 1; i ++) {
            maxendinghere = prices[i + 1] - prices[i] + maxendinghere;
            maxendinghere = maxendinghere > 0 ? maxendinghere : 0;
            maxsofar = maxendinghere > maxsofar ? maxendinghere : maxsofar; 
        }
        
        return (maxsofar);
    }
}