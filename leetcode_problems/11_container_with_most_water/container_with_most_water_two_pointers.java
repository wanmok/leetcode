class Solution {
    public int maxArea(int[] height) {
        int p1 = 0, p2 = height.length - 1;
        int area = 0;
        
        while (p1 < p2) {
            // the height depends on the shorter one
            int current = Math.min(height[p1], height[p2]) * (p2 - p1);
            area = Math.max(area, current);
            // how to make it maximized? move which pointer?
            if (height[p1] > height[p2])
                p2 --;
            else
                p1 ++;
        }
        
        return area;
    }
}