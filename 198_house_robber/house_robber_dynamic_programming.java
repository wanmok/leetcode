class Solution {
    public int rob(int[] nums) {
        int slow = 0, fast = 0;
        
        for (int i = 0; i < nums.length; i ++) {
            if (i % 2 == 0) {
                int temp = slow + nums[i];
                slow = temp > fast ? temp : fast;
            } else {
                int temp = fast + nums[i];
                fast = temp > slow ? temp : slow;
            }
        }
        
        return (fast > slow ? fast : slow);
    }
}