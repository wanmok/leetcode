class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    
    private boolean solve(char[][] board) {
        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k ++) {
                        if (isValid(board, i, j, k)) {
                            board[i][j] = k;
                            
                            if (solve(board)) return true;
                            else {
                                board[i][j] = '.';
                            }
                        }
                    }
                    
                    return false;
                }
            }
        }
        
        return true;
    }
    
    private boolean isValid(char[][] board, int x, int y, char num) {
        for (int i = 0; i < 9; i ++) {
            if (board[x][i] != '.' && board[x][i] == num) return false;
            if (board[i][y] != '.' && board[i][y] == num) return false;
            if (board[(x / 3) * 3 + i / 3][(y / 3) * 3 + i % 3] != '.' 
                && board[(x / 3) * 3 + i / 3][(y / 3) * 3 + i % 3] == num)
                return false;
        }
        
        return true;
    }
    
}