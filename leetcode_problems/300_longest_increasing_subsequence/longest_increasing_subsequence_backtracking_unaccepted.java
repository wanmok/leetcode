class Solution {
    public int lengthOfLIS(int[] nums) {
        return(lis(nums, 0, Integer.MIN_VALUE, 0));
    }
    
    private int lis(int[] nums, int start, int prev, int sum) {
        if (start == nums.length)
            return (sum);
        
        int max = 0;
        for (int i = start; i < nums.length; i ++) {
            if (nums[i] > prev) {
                int sub = lis(nums, i + 1, nums[i], sum) + 1;
                if (sub > max) {
                    max = sub;
                }
                    
            }
        }
        
        return (max);
    }
}