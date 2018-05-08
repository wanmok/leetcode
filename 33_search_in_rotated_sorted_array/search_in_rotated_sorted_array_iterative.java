class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] > nums[right]) left = mid + 1;
            else right = mid;
        }
        
        int rotPoint = left;
        left = 0;
        right = nums.length - 1;
        
        while (left <= right) {
            
            int mid = (left + right) / 2;
            int realMid = (mid + rotPoint) % nums.length;
            
            if (target == nums[realMid]) return realMid;
            else if (target < nums[realMid]) right = mid - 1;
            else left = mid + 1;
        }
        
        return -1;
    }
}