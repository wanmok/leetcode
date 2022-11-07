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
        return (res != -1 ? 
                nums[res] : 
                nums[0] > nums[nums.length - 1] ? 
                nums[nums.length - 1] : 
                nums[0]);
    }
    
    
    
    private int search(int[] nums, int left, int right) {
        if (left == right) return (-1);
        
        int mid = (left + right) / 2;
        if (mid > 0) {
            if (nums[mid - 1] > nums[mid])
                return (mid);
            else {
                int pos_l = search(nums, left, mid);
                int pos_r = search(nums, mid + 1, right);
                if (pos_l != -1) return (pos_l);
                if (pos_r != -1) return (pos_r);
                
                return (-1);
            }
        } else 
            return (-1);
    }
}