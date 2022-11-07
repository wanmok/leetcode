class Solution {
    // @COMPANY Facebook
	// @KEYWORD Array, Binary Search
    // @NOTE Regard the array as a round array.
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        
        int lo=0, hi=nums.length-1;
        while (lo < hi) {
            int mid = lo + hi >> 1;
            if (nums[mid] > nums[hi])
                lo = mid + 1;
            else
                hi = mid;
        }
        int round = lo;
        lo = 0;
        hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + hi >> 1;
            int pos = (mid + round) % nums.length;
            if (nums[pos] == target) return pos;
            else if (nums[pos] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        
        return -1;
    }
}