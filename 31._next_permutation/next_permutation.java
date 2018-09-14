class Solution {
    // @COMPANY Facebook
	// @KEYWORD Array
    // @NOTE Try to discover the latent properties of permutation. What is the next permutation?
    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i >= 0; i --) {
            if (i > 0 && nums[i - 1] < nums[i]) {
                int j = nums.length - 1;
                while (nums[i - 1] >= nums[j]) j --;
                swap(nums, i - 1, j);
                reverse(nums, i, nums.length - 1);
                return ;
            }
        }
        reverse(nums, 0, nums.length - 1);
    }
    
    private void reverse(int[] nums, int lo, int hi) {
        for (int i = 0; i <= (hi - lo >> 1); i ++) {
            swap(nums, i + lo, hi - i);
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}