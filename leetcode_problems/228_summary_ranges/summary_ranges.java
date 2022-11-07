class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) return new ArrayList<>();
        
        List<String> result = new ArrayList<>();
        
        int left = 0, right = 1;
        while (right <= nums.length) {
            // this method is very tricky to avoid int overflow
            if (right == nums.length || nums[right] > 1 + nums[right - 1]) { 
                StringBuilder sb = new StringBuilder();
                sb.append(nums[left]);
                if (right - 1 > left) {
                    sb.append("->");
                    sb.append(nums[right - 1]);
                }
                result.add(sb.toString());
                left = right;
            } 
            right ++;
        }
        
        return result;
    }
}