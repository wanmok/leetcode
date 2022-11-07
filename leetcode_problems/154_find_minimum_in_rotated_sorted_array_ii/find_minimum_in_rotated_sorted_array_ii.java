class Solution {
    public int findMin(int[] nums) {
        
        int start = 0, end = nums.length - 1;
        
        while (start < end) {
            // remember there actually are two ending criteria
            if (nums[start] < nums[end])
                return nums[start];
            
            int mid = (start + end) / 2;
            if (nums[mid] > nums[end])
                start = mid + 1;
            else if (nums[mid] < nums[end])
                end = mid;
            else
                start ++;
        }
        
        return nums[start];
    }
}