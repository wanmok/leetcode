class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        return Math.max(r(nums, 0, nums.length - 2),
                       r(nums, 1, nums.length - 1));
    }
    
    private int r(int[] nums, int left, int right) {
        int slow = 0, fast = 0;
        
        for (int i = left; i <= right; i ++) {
            if (i % 2 == 0) 
                slow = Math.max(slow + nums[i], fast);
            else 
                fast = Math.max(fast + nums[i], slow);
        }
        
        return Math.max(slow, fast);
    }
}