class Solution {
    public int mySqrt(int x) {
        if (x == 0) return 0;
        int left = 1, right = x / 2 + 1;
        
        while (true) {
            int mid = (left + right) / 2;
            
            if (mid > x / mid) right = mid - 1;
            else {
                if (mid + 1 > x / (mid + 1))  // prevent int overflow
                    return mid;
                left = mid + 1;
            }
        }
    }
    
}
//2147483647