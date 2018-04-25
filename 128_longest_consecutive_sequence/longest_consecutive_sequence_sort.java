class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return (0); // don't forget this special case
        
        Arrays.sort(nums); // this is an O(NlogN) operation
        
        int start = 0, max = 1; // what if [0]?
        int count = 0; // deal with duplicates
        for (int i = 0; i < nums.length; i ++) {
            if (i > 0) { // don't forget when 0, 0, 1 the sort method will be wrong
                int delta = nums[i] - nums[i - 1];
                if (delta == 0){
                    count ++;
                } else if (delta != 1) {
                    if (i - start - count > max) {
                        max = i - start - count;
                    }
                    start = i;
                    count = 0;
                }
                if (i == nums.length - 1 && i - start - count + 1 > max)
                    max = i - start - count + 1;
                
            }
        }
        
        return (max);
    }
}

// a more clean version
class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return (0); // don't forget this special case
        
        Arrays.sort(nums); // this is an O(NlogN) operation
        
        int start = 0, max = 0; // what if [0]?
        int count = 0; // deal with duplicates
        for (int i = 0; i < nums.length; i ++) {
            if (i > 0) { // don't forget when 0, 0, 1 the sort method will be wrong
                int delta = nums[i] - nums[i - 1];
                if (delta == 0){
                    count ++;
                } else if (delta == 1) {
                    if (i - start - count > max)
                        max = i - start - count;
                } else {
                    start = i;
                    count = 0;
                }
                
            }
        }
        
        return (max + 1);
    }
}