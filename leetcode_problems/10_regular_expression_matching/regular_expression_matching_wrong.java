class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Wrong answer, but the idea is quite close to the solution. Don't make the problem more complex.
    public boolean isMatch(String s, String p) {
        return match(s, p, 0, 0, false);
    }
    
    public boolean match(String s, String p, int sp, int pp, boolean prev) {
        if (s.length() == sp){
            if (p.length() != pp) {
                if (p.length() - pp == 1) {
                    if (s.length() != 0 && s.charAt(sp - 1) == p.charAt(pp) 
                        && p.length() >= 3 && p.charAt(pp - 1) == '*')
                        return true;
                    else return false;
                }
                else {
                    if (p.charAt(pp + 1) == '*') return match(s, p, sp, pp + 2, true);
                    else return match(s, p, sp, pp + 1, true);
                }
            } else return true;
        }
        if (p.length() == pp) return false;
        if (p.length() - pp == 1) {
            if (p.charAt(pp) == s.charAt(sp) || p.charAt(pp) == '.') 
                return match(s, p, sp + 1, pp + 1, true);
            else
                return false;
        }
            
        if (p.charAt(pp) == s.charAt(sp) || p.charAt(pp) == '.') {
            if (p.charAt(pp + 1) == '*') {
                return match(s, p, sp + 1, pp, true);
            } else {
                return match(s, p, sp + 1, pp + 1, true);
            }
        } else {
            if (p.charAt(pp + 1) == '*') {
                return match(s, p, sp, pp + 2, false);
            } else return false;
            // if (prev) {
            //     return match(s, p, sp, pp + 2, false);
            // } else return false;
        }
    }
}