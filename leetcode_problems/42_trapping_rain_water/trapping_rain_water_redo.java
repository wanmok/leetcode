class Solution {
    // @COMPANY Facebook
    // @KEYWORD Two Pointers, Array
    // @NOTE The key is to find what determines how much water is trapped. The right bar or the left bar? 
    public int trap(int[] height) {
        int lo = 0, hi = height.length-1;
        int loMax = 0, hiMax = 0;
        int sum = 0;
        
        while (lo < hi){
            if (height[lo] > loMax)
                loMax = height[lo];
            if (height[hi] > hiMax)
                hiMax = height[hi];
            if (loMax > hiMax) {
                hi --;
                sum += Math.max(hiMax-height[hi], 0);
            } else {
                lo ++;
                sum += Math.max(loMax-height[lo], 0);
            }
        }
        
        return sum;
    }
}