class Solution {
    public int totalNQueens(int n) {
        return solve(new ArrayList<>(), n);
    }
    
    private int solve(List<Integer> path, int n) {
        if (n == path.size()) return 1;
        
        int count = 0;
        for (int i = 0; i < n; i ++) {
            if (! canPlace(path, i)) continue;
            
            path.add(i);
            count += solve(path, n);
            path.remove(path.size() - 1);
        }
        
        return count;
    }
    
    private boolean canPlace(List<Integer> path, int pos) {
        int len = path.size();
        // vertical
        if (path.contains(pos)) return false;
        // diagonal
        for (int i = len - 1; i >= 0; i --) {
            int offset = len - i;
            if (path.get(i) == pos + offset)
                return false;
            if (path.get(i) == pos - offset)
                return false;
        }
        return true;
    }
}