class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i = -1;
        for (int num: nums) {
            if (num != i + 1)
                return (i + 1);
            i++;
        }
        return (nums[nums.length - 1] + 1);
    }
}