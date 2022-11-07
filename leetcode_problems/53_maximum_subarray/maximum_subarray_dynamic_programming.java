class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0], curr = 0;
        for (int i = 0; i < nums.length; i ++) {
            int temp = curr + nums[i];
            curr = temp > nums[i] ? temp : nums[i];
            max = curr > max ? curr : max;
        }
        
        return (max);
    }
}