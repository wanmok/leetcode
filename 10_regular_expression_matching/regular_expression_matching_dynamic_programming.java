enum Result{
    TRUE, FALSE;
}
class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Defining enum Result is a quite tricky thing. Also, this is a top-down approach.
    
    Result[][] memo;
    
    public boolean isMatch(String s, String p) {
        memo = new Result[s.length() + 1][p.length() + 1];
        return match(0, 0, s, p);
    }
    
    public boolean match(int i, int j, String s, String p) {
        if (memo[i][j] != null)
            return memo[i][j] == Result.TRUE;
        
        boolean ans;
        if (p.length() == j){  // Why use this?
            ans = s.length() == i;
        } else {
            boolean m = (i < s.length()) && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
            
            if (j + 1 < p.length() && p.charAt(j + 1) == '*')
                ans = match(i, j + 2, s, p ) ||
                    match(i + 1, j, s, p) && m;
            else
                ans = match(i + 1, j + 1, s, p) && m;
        }
        
        memo[i][j] = ans ? Result.TRUE : Result.FALSE;
        return ans;
    }
}