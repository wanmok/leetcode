class Solution {
    // this solution is not very tidy
    // I have to find another elegant way to do this

    public int findMin(int[] nums) {
        int res = search(nums, 0, nums.length - 1);
        return (res == -1 ? nums[0] : nums[res]);
    }
    
    private int search(int[] nums, int left, int right) {
        if (left == right) {
            if (left > 0) {
                if (nums[left - 1] > nums[left])
                    return (left);
                else 
                    return (-1);
            } else 
                return (-1);
        }
        
        int mid = (left + right) / 2;
        int l, r;
        
        if (mid > 0) {
            if (nums[mid - 1] > nums[mid])
                return (mid);
            else {
                int pos_l, pos_r;
                pos_l = search(nums, left, mid);
                pos_r = search(nums, mid + 1, right);
                if (pos_l != -1)
                    return (pos_l);
                if (pos_r != -1)
                    return (pos_r);
                return (-1);
            }
        } else {
            if (mid == nums.length - 1)
                return (mid);
            else {
                if (nums[mid] > nums[mid + 1])
                    return (mid + 1);
                else 
                    return (-1);
            }
        }
        
    }
}