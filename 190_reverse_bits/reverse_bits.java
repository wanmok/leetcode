public class Solution {
    // you need treat n as an unsigned value

    // elegant solution: https://leetcode.com/problems/reverse-bits/discuss/54741/O(1)-bit-operation-C++-solution-(8ms)

    public int reverseBits(int n) {
        int a = 0;
        for (int i = 1; i <= 32; i ++) {
            if ((n & 1) == 1) 
                a |= 1;
            if (i < 32) {
                n >>= 1;
                a <<= 1;
            }
        }
        return a;
    }
}