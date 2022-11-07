class Solution {
    public int findPeakElement(int[] nums) {
        return (peak(nums, 0, nums.length - 1));
    }
    
    private int peak(int[] nums, int left, int right) {
        if (left >= right) 
            return (right);
        
        int mid = (right - left) / 2 + left;
        int l = mid - 1 < 0 ? Integer.MIN_VALUE : nums[mid - 1];
        int r = mid + 1 > nums.length - 1 ? Integer.MIN_VALUE : nums[mid + 1];
        
        if (nums[mid] > l && nums[mid] > r)
            return (mid);
        else if (nums[mid] < l)
            return (peak(nums, left, mid - 1));
        else if (nums[mid] < r)
            return (peak(nums, mid + 1, right));
        
        return (0);
    }
}