class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        return search(matrix, target, 0, 0, m - 1, n - 1);
        
    }
    
    private boolean search(int[][] matrix, int target, int x1, int y1, int x2, int y2) {
        if (x1 > x2 || y1 > y2) return false;
        
        int m = matrix.length, n = matrix[0].length;
        
        int xm = (x1 + x2) / 2;
        int ym = (y1 + y2) / 2;
        
        if (matrix[xm][ym] == target) return true;
        else if (matrix[xm][ym] > target) {
            return search(matrix, target, xm, y1, xm, ym - 1) ||
                search(matrix, target, x1, y1, xm - 1, y2);
        } else {
            return search(matrix, target, xm, ym + 1, xm, y2) ||
                search(matrix, target, xm + 1, y1, x2, y2);
        }
        
    }
}