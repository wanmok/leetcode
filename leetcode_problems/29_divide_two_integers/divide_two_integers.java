class Solution {
    // @COMPANY Facebook
	// @KEYWORD Math, Binary Search, Bit Manipulation
    // @NOTE What we can do if we cannot directly mutiply the divisor to reach the dividend? Bit manipulation!
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;
        
        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;
        
        // convert before abs()!
        long dvd = Math.abs((long)dividend);
        long dvs = Math.abs((long)divisor);
        
        int res = 0;
        while (dvd >= dvs) {
            long temp = dvs, mult = 1;
            while (dvd >= (temp << 1)) {
                temp <<= 1;
                mult <<= 1;
            }
            res += mult;
            dvd -= temp;
        }
        
        return sign == 1 ? res : -res;
        
    }
}