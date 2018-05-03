class Solution {
    // a typical two pointers problem
    // the key is to find :
    // 1. where to place two pointers
    // 2. the criteria to move each pointers.
    // 3. ending criteria
    // what's more
    // the problem statement is tranformed
    // the amount of trapped rain is determined by the shorter elevation
    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int left_max = 0, right_max = 0;
        int sum = 0;
        while (left < right) {
            if (height[left] > left_max)
                left_max = height[left];
            if (height[right] > right_max)
                right_max = height[right];
            if (left_max > right_max) {
                right --;
                sum += Math.max(right_max - height[right], 0);
            } else {
                left ++;
                sum += Math.max(left_max - height[left], 0);
            }
        }
        
        return sum;
    }
}