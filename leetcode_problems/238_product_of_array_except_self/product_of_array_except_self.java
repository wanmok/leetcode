class Solution {
    // this problem gets a lot to think about
    // 1. how to accumulate the product without including itself
    // 2. how to multiply the numbers from two sides
    // the idea behind this two pass approach is important
    // it can be extrapolated to be applied to problems
    // that need to use previous results (same as dynamic programming)

    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i = 1; i < nums.length; i ++) {
            result[i] = result[i - 1] * nums[i - 1];
        }
        int right = 1;
        for (int i = nums.length - 1; i >= 0; i --) {
            result[i] *= right;
            right *= nums[i];
        }
        
        return result;
    }
}