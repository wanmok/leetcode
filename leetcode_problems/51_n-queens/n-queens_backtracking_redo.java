class Solution {
    // @COMPANY Facebook
    // @KEYWORD Backtracking
    // @NOTE Typical backtracking problem. Construct validation function and solve function.
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new LinkedList<>();
        
        solve(result, new LinkedList<>(), n);
        
        return result;
    }
    
    private void solve(List<List<String>> result, List<Integer> path, int n) {
        if (path.size() == n) {
            List<String> res = new LinkedList<>();
            for (int pos : path) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < n; i ++) {
                    if (pos == i)
                        sb.append('Q');
                    else
                        sb.append('.');
                }
                res.add(sb.toString());
            }
            result.add(res);
        }
        
        for (int i = 0; i < n; i ++) {
            if (isValid(path, i)) {
                path.add(i);
                solve(result, path, n);
                path.remove(path.size() - 1);
            }
        }
    
    }
    
    private boolean isValid(List<Integer> path, int pos) {
        if (path.contains(pos)) return false;
        
        int len = path.size();
        for (int i = len - 1; i >= 0; i --) {
            int offset = len - i;
            if (pos + offset == path.get(i) ||
               pos - offset == path.get(i))
                return false;
        }
        
        return true;
    }
}