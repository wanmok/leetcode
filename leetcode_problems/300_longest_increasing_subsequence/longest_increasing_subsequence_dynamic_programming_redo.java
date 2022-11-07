class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming, Binary Search
    // @NOTE Very simple idea and typical dp problem....
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        
        int result = 0;
        for (int i = 0; i < nums.length; i ++) {
            dp[i] = 1;
            for (int j = 0; j < i; j ++) {
                if (nums[i] > nums[j]) {  // larger or equal ? ask the interviewer~
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            result = Math.max(result, dp[i]);
        }
        
        return result;
    }
}