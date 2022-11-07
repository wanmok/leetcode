class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if (nums.length == 0) return 0;
        
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;
        
        int left = 0, right = 0;
        
        while (left < nums.length) {
            if (sum < s) {
                if (right == nums.length) break;
                
                sum += nums[right];
                count ++;
                right ++;
            } else {
                if (count < min) min = count;
                sum -= nums[left];
                left ++;
                count --;
            }
        }
        
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}