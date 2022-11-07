class Solution {
    public int minCut(String s) {
        if (s.length() == 0) return 0;
        
        return solve(new ArrayList<>(), s, 0) - 1;
    }
    
    private int solve(List<String> path, String s, int start) {
        if (start >= s.length()) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = start + 1; i <= s.length(); i ++) {
            StringBuilder sb = new StringBuilder(s.substring(start, i));
            if (sb.toString().equals(sb.reverse().toString())) {
                path.add(sb.toString());
                int count = solve(path, s, i);
                path.remove(path.size() - 1);
                if (count < min) min = count;
            }
        }
        
        return min + 1;
    }
}