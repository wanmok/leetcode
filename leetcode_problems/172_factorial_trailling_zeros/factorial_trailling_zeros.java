class Solution {
    public int trailingZeroes(int n) {
        // well...this is a really silly problem...
        // just need to figure out how many 5 within this sequence
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
}