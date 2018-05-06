class Solution {
    public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
        int left = Math.max(A, E), right = Math.max(left, Math.min(C, G));
        int bottom = Math.max(B, F), top = Math.max(bottom, Math.min(D, H));
        return (D - B) * (C - A) - (right - left) * (top - bottom) + (H - F) * (G - E);
    }
}