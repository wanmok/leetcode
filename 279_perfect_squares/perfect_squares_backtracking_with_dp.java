class Solution {
    // well.... just slightly changed the code
    // then it accepted...
    // =.= silly problem....
    // what about a better version?

    public int numSquares(int n) {
        int[] dp = new int[n + 1];
        return search(n, dp);
    }
    
    private int search(int n, int[] dp) {    
        int near = (int)Math.sqrt(n);
        if (near == Math.sqrt(n)) return 1;
        
        int min = Integer.MAX_VALUE; 
        for (int i = 1; i <= near; i ++) {
            int current = 0;
            int remain = n - i * i;
            if (remain != 0) {
                if (dp[remain] == 0) {
                    current = search(remain, dp) + 1;
                    dp[remain] = current;
                }
                else
                    current = dp[remain];
            }
                
            if (current < min)
                min = current;
        }
        
        return (min);
    }
}