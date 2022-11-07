class Solution {
    // @COMPANY Facebook
	// @KEYWORD Dynamic Programming
    // @NOTE Although I have identified this problem as a dp problem and figured out its form, I still have to work on its subproblems. How to define the subproblem and relate it to the original?
    
    public int longestValidParentheses(String s) {
        if (s.length() == 0) return 0;
        
        int max = 0;
        int[] memo = new int[s.length()];
        memo[0] = 0;
        for (int i = 1; i < s.length(); i ++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    memo[i] = i >= 2 ? memo[i - 2] + 2 : 2;
                } else if (i - 1 - memo[i-1] >= 0 &&
                           s.charAt(i - 1 - memo[i-1]) == '(') {
                    memo[i] = memo[i-1] + (i-memo[i-1]-2 >= 0 ? memo[i-memo[i-1]-2] : 0) + 2;
                }
                max = Math.max(max, memo[i]);
            }
        }
        
        return max;
    }
}