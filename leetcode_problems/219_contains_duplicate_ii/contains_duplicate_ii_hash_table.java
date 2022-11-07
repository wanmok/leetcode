class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;
        
        Set<Integer> numSet = new HashSet<>();
        
        for (int i = 0; i < nums.length; i ++) {
            if (i > k) 
                numSet.remove(nums[i - k - 1]);
            if (numSet.contains(nums[i]))
                return true;
            numSet.add(nums[i]);
        }
        
        return false;
    }
}