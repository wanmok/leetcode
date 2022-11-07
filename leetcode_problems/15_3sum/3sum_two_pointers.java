class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        for (int i = 0; i < nums.length; i ++) {
            if (i == 0 || (i > 0 && nums[i - 1] != nums[i])) {
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    if (nums[i] + nums[left] + nums[right] == 0) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left ++;
                        while (left < right && nums[right] == nums[right - 1]) right --;
                        left ++;
                        right --;
                    }
                    else if (nums[i] + nums[left] + nums[right] > 0)
                        right --;
                    else 
                        left ++;
                }
            }
        }
        
        return result;
    }
}