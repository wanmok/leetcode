class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Two Pointers
    // @NOTE Fast and slow pointers. The fast one will go through all the numbers and the slow one will move the non-zero number to the right place.
    public void moveZeroes(int[] nums) {
        for (int i = 0, j = 0; i < nums.length; i ++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j ++;
            }
        }
    }
}