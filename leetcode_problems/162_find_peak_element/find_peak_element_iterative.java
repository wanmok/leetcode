class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1, mid;
        
        while (left < right) {
            mid = (left + right) / 2;
            if (nums[mid] > nums[mid + 1])
                right = mid;
            else
                left = mid + 1;
        }
        
        return (left);
    }   
}