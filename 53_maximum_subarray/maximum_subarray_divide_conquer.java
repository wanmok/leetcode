class Solution {
    public int maxSubArray(int[] nums) {
        return (find_max_sub(nums, 0, nums.length - 1));
    }
    
    private int find_cross_sum_max(int[] nums, int left, int mid, int right) {
        int left_pos = 0, right_pos = 0, left_sum = Integer.MIN_VALUE, right_sum = Integer.MIN_VALUE;
        
        int sum = 0;
        for (int i = mid; i >= left; i --) {
            sum += nums[i];
            if (sum > left_sum) {
                left_sum = sum;
                left_pos = i;
            }
        }
        
        sum = 0;
        for (int i = mid + 1; i <= right; i ++) {
            sum += nums[i];
            if (sum > right_sum) {
                right_sum = sum;
                right_pos = i;
            }
        }
        
        return (left_sum + right_sum);
    }
    
    private int find_max_sub(int[] nums, int left, int right) {
        if (left == right) 
            return (nums[left]);
        else {
            int mid = (left + right) / 2;
            
            int left_result = find_max_sub(nums, left, mid);
            int right_result = find_max_sub(nums, mid + 1, right);
            int cross_result = find_cross_sum_max(nums, left, mid, right);
            
            if (left_result >= right_result && left_result >= cross_result)
                return (left_result);
            else if (right_result >= left_result && right_result >= cross_result)
                return (right_result);
            else
                return (cross_result);
        }
    }
    
}