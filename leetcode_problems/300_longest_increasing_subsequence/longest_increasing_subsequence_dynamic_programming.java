class Solution {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0)
            return (0);
        
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int max = 0;
        for (int i = 0; i < nums.length; i ++) {
            int current = 0;
            
            for (int j = 0; j < i; j ++) 
                if (nums[j] < nums[i])
                    current = Math.max(dp[j], current);
            
            dp[i] = current + 1;
            
            max = Math.max(dp[i], max);
        }
        
        return (max);
    }
}