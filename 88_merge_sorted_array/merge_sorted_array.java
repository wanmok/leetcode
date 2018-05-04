class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, curr = m + n - 1;
        
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] >= nums2[p2]) {
                nums1[curr] = nums1[p1];
                p1 --;
            } else {
                nums1[curr] = nums2[p2];
                p2 --;
            }
            curr --;
        }
        while (p1 >= 0 || p2 >= 0) {
            if (p1 >= 0) nums1[curr] = nums1[p1];
            if (p2 >= 0) nums1[curr] = nums2[p2];
            p1 --;
            p2 --;
            curr --;
        }
    }
}