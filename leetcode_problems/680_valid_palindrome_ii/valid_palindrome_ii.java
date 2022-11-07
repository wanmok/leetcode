class Solution {
    // @COMPANY Facebook
    // @KEYWORD String
    // @NOTE Don't forget there is another case.
    public boolean validPalindrome(String s) {
        if (s.length() == 0) return true;
        int i = 0, j = s.length()-1;
        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) {
                return check(s, i+1, j) || check(s, i, j-1);
            }
            i ++;
            j --;
        }
        return true;
    }
    
    private boolean check(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start) != s.charAt(end))
                return false;
            start ++;
            end --;
        }
        return true;
    }
}