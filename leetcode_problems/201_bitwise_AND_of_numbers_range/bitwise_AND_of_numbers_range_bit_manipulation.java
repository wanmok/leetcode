class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int i = 0, tm = m, tn = n;
        while ((m >> i) != (n >> i))
            i ++;
        
        return ((n >> i) << i);
    }
}