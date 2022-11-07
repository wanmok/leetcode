class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int closest = nums[0] + nums[1] + nums[2];
        
        for (int i = 0; i < nums.length; i ++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (sum == target)
                        return target;
                    else if (sum > target)
                        right --;
                    else left ++;
                    
                    if (Math.abs(target - sum) < Math.abs(target - closest))
                        closest = sum;
                }
            }
        }
        
        return closest;
    }
}