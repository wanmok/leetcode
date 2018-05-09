class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        solve(result, new ArrayList<>(), n);
        return result;
    }
    
    private void solve(List<List<String>> result, List<Integer> path, int n) {
        if (n == path.size()) {
            List<String> res = new ArrayList<>();
            for (int pos : path) {
                StringBuilder sb = new StringBuilder(n);
                for (int i = 0; i < n; i ++) {
                    if (i == pos) sb.append('Q');
                    else sb.append('.');
                }
                res.add(sb.toString());
            }
            result.add(res);
            return ;
        }
        
        for (int i = 0; i < n; i ++) {
            if (! canPlace(path, i)) continue;
            
            path.add(i);
            solve(result, path, n);
            path.remove(path.size() - 1);
        }
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