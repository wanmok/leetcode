class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Two Pointers
	// @NOTE Figure out loop invariant. Why two pointers? How to use it?
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        
        // As the arrays are sorted, so we can end early and then loop over the remained elements.
        while (i >= 0 && j >= 0) {  // loop criteria?
             if (nums1[i] > nums2[j]) {
                 nums1[k --] = nums1[i];
                 i --;
             } else {
                 nums1[k --] = nums2[j];
                 j --;
             }
        }
        
        while (j >= 0) {
            nums1[k --] = nums2[j --];
        }
        
    }
}