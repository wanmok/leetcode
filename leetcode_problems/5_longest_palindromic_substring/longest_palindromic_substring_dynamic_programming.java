class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Remember to identify the variables invovled and figure out what will be the base case. boolean not bool...\\ s.subtring(a, b) is [a, b)
    public String longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        
        boolean[][] memo = new boolean[s.length()][s.length()];
        int m1=0, m2=0;
        
        for (int i = 0; i < s.length(); i ++) {
            for (int j = i; j < s.length(); j ++) {
                if (palindrome(s, i, j, memo)) {
                    if (j - i > m2 - m1) {
                        m2 = j;
                        m1 = i;
                    }
                }
            }
        }
        
        return s.substring(m1, m2 + 1);
    }
    
    public boolean palindrome(String s, int p1, int p2, boolean[][] memo) {
        if (p1 >= p2) return true;
        
        if (memo[p1][p2]) return true;
        
        if (s.charAt(p1) != s.charAt(p2)) {
            memo[p1][p2] = false;
            return false;
        }
        
        if (palindrome(s, p1 + 1, p2 - 1, memo)) {
            memo[p1][p2] = true;
            return true;
        }
        
        return false;
    }
}