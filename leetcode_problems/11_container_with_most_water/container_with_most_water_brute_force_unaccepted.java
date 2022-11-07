class Solution {
    public int maxArea(int[] height) {
        int p1 = 0, p2 = 0;
        int area = 0;
        
        while (p1 < height.length) {
            for (p2 = p1 + 1; p2 < height.length; p2 ++) {
                int shorter = Math.min(height[p1], height[p2]);
                int s = shorter * (p2 - p1);
                if (s > area)
                    area = s;
            }
            p1 ++;
        }
        
        return area;
    }
}