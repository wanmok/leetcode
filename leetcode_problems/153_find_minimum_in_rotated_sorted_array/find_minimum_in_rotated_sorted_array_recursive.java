class Solution {
    // think about some basic cases
    // case 1:
    // [0] where there is no changing point and left == right == mid
    // case 2:
    // [5, 1, 2, 3] where the changing point is between 0 ~ (nums.length - 1)
    // having nums[point] < nums[point - 1]
    // case 3:
    // [0, 1, 2, -1] where the changing point is at the end of the array
    // having nums[point] < nums[point - 1]
    // consider ending criteria
    // left == right
    
    public int findMin(int[] nums) {
        int res = search(nums, 0, nums.length - 1);
        return (res);
    }
    
    private int search(int[] nums, int left, int right) {
        if (left == right) return (nums[left]);
        
        int mid = (left + right) / 2;
        if (nums[mid] > nums[right])
            return (search(nums, mid + 1, right));
        else
            return (search(nums, left, mid));
    }
}