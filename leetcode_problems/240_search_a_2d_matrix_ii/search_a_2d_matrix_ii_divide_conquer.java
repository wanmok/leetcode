class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0)
            return (false);
        int m = matrix[0].length;
        if (m == 0)
            return (false);
        return (search(matrix, target, 0, 0, n - 1, m - 1));
    }
    
    private boolean search(int[][] matrix, int target, int lx, int ly, int rx, int ry) {
        if (lx > rx || ly > ry)
            return (false);
        
        int k = (rx - lx) / 2 + lx, l = (ry - ly) / 2 + ly;
        
        if (target == matrix[k][l]) {
            return (true);
        } else if (target < matrix[k][l]) {
            return (search(matrix, target, lx, ly, k - 1, ry) || 
                    search(matrix, target, k, ly, rx, l - 1));
        } else {
            return (search(matrix, target, k + 1, ly, rx, ry) || 
                    search(matrix, target, lx, l + 1, k, ry));
        }
    }
}