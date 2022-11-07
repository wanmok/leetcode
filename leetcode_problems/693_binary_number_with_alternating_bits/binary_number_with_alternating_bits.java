class Solution {
    // ref: https://leetcode.com/problems/binary-number-with-alternating-bits/discuss/108427/Oneliners-(C++-Java-Ruby-Python)
    
    public boolean hasAlternatingBits(int n) {
        return ((n ^= (n >> 2)) & (n - 1)) == 0;
    }
}