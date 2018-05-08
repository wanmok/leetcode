class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) return -1;
        
        return binarySearch(nums, target, 0, nums.length - 1);
    }
    
    private int binarySearch(int[] nums, int target, int left, int right) {
        if (left >= right) {
            if (nums[left] == target) return left;
            return -1;
        }
        
        int mid = (left + right) / 2;
        int res = -1;
        
        if (target == nums[mid]) return mid;
        else if (target < nums[mid]) {
            res = binarySearch(nums, target, left, mid);
            if (res == -1) res = binarySearch(nums, target, mid + 1, right);
        } else {
            res = binarySearch(nums, target, mid + 1, right);
            if (res == -1) res = binarySearch(nums, target, left, mid);
        }
        
        return res;
    }
}