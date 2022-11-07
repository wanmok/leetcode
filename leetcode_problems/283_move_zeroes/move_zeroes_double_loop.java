class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - count; i ++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length - count; j ++){
                    nums[j - 1] = nums[j];
                }
                nums[nums.length - count - 1] = 0;
                count ++;
                i --;
            }
        }
    }
}