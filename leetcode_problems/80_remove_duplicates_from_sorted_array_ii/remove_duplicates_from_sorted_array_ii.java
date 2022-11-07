class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        
        int len = 1;
        int prev = nums[0], count = 1;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] != prev) {
                nums[len] = nums[i];
                prev = nums[i];
                count = 1;
                len ++;
            } else if (count == 1) {
                nums[len] = prev;
                count ++;
                len ++;
            }
        }
        
        return len;
    }
}