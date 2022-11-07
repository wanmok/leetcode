class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0 || t < 0 || nums.length == 0) return false;
        
        TreeSet<Double> numSet = new TreeSet<>();
        
        for (int i = 0; i < nums.length; i ++) {
            if (i > k) numSet.remove((double)nums[i - k - 1]);
            Double ceil = numSet.ceiling(nums[i] - (double)t);
            Double floor = numSet.floor(nums[i] + (double)t);
            if ((ceil != null && ceil <= nums[i]) 
                || (floor != null && floor >= nums[i]))
            {
                return true;
                
            }
                
            numSet.add((double)nums[i]);
        }
        
        return false;
    }
}