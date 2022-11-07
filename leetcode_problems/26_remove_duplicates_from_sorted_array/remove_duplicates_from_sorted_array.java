class Solution {
    // this is actually a two pointers problem

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int len = 1, prev = nums[0];
        for (int i = 0; i < nums.length; i ++) {
            if (nums[i] != prev) {
                nums[len] = nums[i];
                prev = nums[i];
                len ++;
            }
        }
        
        return len;
    }
}