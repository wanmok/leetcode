class Solution {
    // I think this can be a very interesting and tricky
    // bit manipulation appraoch to solve this problem
    // what I have to bear in mind is that the two stages of 
    // the states can be stored in-place and can easily be retrieved
    // by both states
    // that means segmentations among bits can be used to store stages
    // discussion: https://leetcode.com/problems/game-of-life/discuss/73223/Easiest-JAVA-solution-with-explanation
    
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        
        for (int i = 0; i < m; i ++) {
            for (int j = 0; j < n; j ++) {
                int live_cells = count_live(board, m, n, i, j);
                
                if ((board[i][j] & 1) == 1) {
                    if (live_cells >= 2 && live_cells <= 3) board[i][j] |= 2;
                } else if (live_cells == 3) 
                    board[i][j] |= 2;
            }
        }
        
        for (int i = 0; i < m; i ++) 
            for (int j = 0; j < n; j ++)
                board[i][j] >>= 1;
        
    }

    private int count_live(int[][] board, int m, int n, int x, int y) {
        int live = 0;
        
        for (int i = Math.max(x - 1, 0); i <= Math.min(x + 1, m - 1); i ++) {
            for (int j = Math.max(y - 1, 0); j <= Math.min(y + 1, n - 1); j ++) {
                live += board[i][j] & 1;
            }
        }
        live -= board[x][y] & 1;
        
        return live;
    }
    
}