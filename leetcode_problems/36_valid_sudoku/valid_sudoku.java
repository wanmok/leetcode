class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i ++) {
            if (!check_row(board, i) || !check_column(board,i))
                return false;
        }
        
        for (int i = 0; i < 3; i ++) {
            for (int j = 0; j < 3; j ++) {
                if (!check_sub(board, 3 * i, 3 * j))
                    return false;
            }
        }
        
        return true;
    }
    
    private boolean check_sub(char[][] board, int grid_x, int grid_y) {
        Set<Integer> dup = new HashSet<>();
        
        for (int i = grid_x; i < grid_x + 3; i ++) {
            for (int j = grid_y; j < grid_y + 3; j ++) {
                if (board[i][j] == '.') continue;
                if (dup.contains(Integer.valueOf(board[i][j])))
                    return false;
                else
                    dup.add(Integer.valueOf(board[i][j]));
            }
        }
        
        return true;
    }
    
    private boolean check_row(char[][] board, int row) {
        Set<Integer> dup = new HashSet<>();
        
        for (int i = 0; i < 9; i ++) {
            if (board[row][i] == '.') continue;
            if (dup.contains(Integer.valueOf(board[row][i])))
                return false;
            else
                dup.add(Integer.valueOf(board[row][i]));
        }
        
        return true;
    }
    
    private boolean check_column(char[][] board, int column) {
        Set<Integer> dup = new HashSet<>();
        
        for (int i = 0; i < 9; i ++) {
            if (board[i][column] == '.') continue;
            if (dup.contains(Integer.valueOf(board[i][column])))
                return false;
            else
                dup.add(Integer.valueOf(board[i][column]));
        }
        
        return true;
    }
}