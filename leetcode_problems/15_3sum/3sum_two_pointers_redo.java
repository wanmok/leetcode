class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Two Pointers
    // @NOTE How to avoid duplicate triplets. Skip them using loops!
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length; i ++) {
            if (i > 0 && nums[i - 1] == nums[i]) continue;
            
            int low = i + 1, high = nums.length - 1, remain = 0 - nums[i];
            while (low < high) {
                if (nums[low] + nums[high] == remain) {
                    result.add(Arrays.asList(new Integer[]{nums[i], nums[low], nums[high]}));
                    while (low < high && nums[low] == nums[low+1]) low ++;  // move to next different num
                    while (low < high && nums[high] == nums[high - 1]) high --;
                    low ++;
                    high --;
                } else if (nums[low] + nums[high] < remain) low ++;
                else high --;
            }
        }
        
        return result;
    }
}