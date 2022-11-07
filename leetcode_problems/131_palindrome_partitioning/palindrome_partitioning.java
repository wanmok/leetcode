class Solution {
    public List<List<String>> partition(String s) {
        if (s.length() == 0) return new ArrayList<>();
        
        List<List<String>> result = new ArrayList<>();
        solve(result, new ArrayList<>(), s, 0);
        
        return result;
    }
    
    private void solve(List<List<String>> result, List<String> path, String s, int start) {
        if (start >= s.length()) {
            result.add(new ArrayList(path));
            return ;
        }
        
        for (int i = start + 1; i <= s.length(); i ++) {
            StringBuilder sb = new StringBuilder(s.substring(start, i));
            if (sb.toString().equals(sb.reverse().toString())) {
                path.add(sb.toString());
                solve(result, path, s, i);
                path.remove(path.size() - 1);
            }
        }
    }
}