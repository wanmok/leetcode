class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n + 1];
        int c2 = 0, c3 = 0, c5 = 0;
        
        if (n == 0) return 1;
        if (n < 0) return 1;
        
        ugly[0] = 1;
        for (int i = 1; i < n; i ++) {
            ugly[i] = Math.min(Math.min(ugly[c2] * 2, ugly[c3] * 3), ugly[c5] * 5);
            if (ugly[i] == ugly[c2] * 2) c2 ++;
            if (ugly[i] == ugly[c3] * 3) c3 ++;
            if (ugly[i] == ugly[c5] * 5) c5 ++;
        }
        
        return ugly[n - 1];
    }
}