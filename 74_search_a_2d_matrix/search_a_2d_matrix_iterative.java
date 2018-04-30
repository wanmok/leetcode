class Solution {
    // pay more attention to constraints!!!
    // sorted matrxi
    // so treat it just like an sorted array, then do binary searching
    public boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        
        int left = 0, right = m * n - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            int num = matrix[mid / n][mid % n];
            if (target == num) return true;
            else if (target > num) left = mid + 1;
            else right = mid;
        }
        int mid = (left + right) / 2;
        return matrix[mid / n][mid % n] == target;
    }
}