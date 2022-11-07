class Solution {
    public void gameOfLife(int[][] board) {
        // this solution will cost extra memory
        // as it needs an auxiliary array to store current state

        int m = board.length, n = board[0].length;
        int[][] count = new int[m][n];
        
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                count[i][j] = count_live(board, i, j);
            }
        }
        
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                if (board[i][j] == 1) {
                    if (count[i][j] < 2)
                        board[i][j] = 0;
                    else if (count[i][j] > 3)
                        board[i][j] = 0;
                } else {
                    if (count[i][j] == 3)
                        board[i][j] = 1;
                }
            }
        }
    }

    private int count_live(int[][] board, int x, int y) {
        int x_mod = x - 1, y_mod = y - 1;
        x_mod = x_mod < 0 ? 0 : x_mod;
        y_mod = y_mod < 0 ? 0 : y_mod;
        int live = 0;
        for (int i = x_mod; i <= x + 1 && i < board.length; i ++) {
            for (int j = y_mod; j <= y + 1 && j < board[0].length; j ++) {
                if (i == x && j == y) // don't count yourself
                    continue;
                if (board[i][j] == 1)
                    live ++;
            }
        }
        return live;
    }
    
}