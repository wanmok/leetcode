class Solution {
    public int rob(int[] nums) {
        return (solve(nums, 0, 0));
    }
    
    private int solve(int[] nums, int sum, int start) {
        if (start >= nums.length)
            return (sum);
        
        int max = Integer.MIN_VALUE;
        for (int i = start; i < nums.length; i ++) {
            int sub_max = solve(nums, sum + nums[i], i + 2);
            
            if (sub_max > max)
                max = sub_max;
        }
        
        return (max);
    }
}