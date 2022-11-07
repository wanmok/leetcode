class Solution {
    // consider what will be the h?
    // understand how to tranform the problem
    public int hIndex(int[] citations) {
        int len = citations.length;
        if (len == 0) return 0;
        
        int left = 0, right = len - 1;
        int mid = (left + right) / 2;
        
        while (left <= right) {
            mid = (left + right) / 2;
            // use (len - mid) to represent h
            
            if (citations[mid] >= len - mid) right = mid - 1;
            else left = mid + 1;
        }
        
        return len - left;
    }
}