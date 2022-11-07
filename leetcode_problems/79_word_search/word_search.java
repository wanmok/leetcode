class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Backtracking
    // @NOTE Mask trick is important in remembering the path and saving memory. The recursion should find the path wrong ASAP.
    
    public boolean exist(char[][] board, String word) {
        boolean ans = false;
        for (int i = 0; i < board.length; i ++) {
            for (int j = 0; j < board[0].length; j++) {
                ans = search(board, word, new StringBuilder(), i, j, 0);
                if (ans) return true;
            }
        }
        return false;
    }
    
    private boolean search(char[][] board, String word, StringBuilder path, int x, int y, int pos) {
        if (path.length() == word.length()) return true;
        if (x == board.length || x < 0 || y == board[0].length || y < 0)
            return false;
        
        if (board[x][y] != word.charAt(pos)) return false;
        
        path.append(board[x][y]);
        board[x][y] ^= 255;
        boolean ans = word.equals(path.toString());
        ans = search(board, word, path, x + 1, y, pos+1)
            || search(board, word, path, x - 1, y, pos+1)
            || search(board, word, path, x, y + 1, pos+1)
            || search(board, word, path, x, y - 1, pos+1);
        path.deleteCharAt(path.length() - 1);
        board[x][y] ^= 255;
        
        return ans;
    }
}