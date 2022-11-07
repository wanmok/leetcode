class Solution {
    public boolean isPalindrome(int x) {
        // this solution creates a string (extra memory)
        // so it is not allowed by the problem
        if (x < 0) return false;
        
        String s = String.valueOf(x);
        int len = s.length();
        for (int i = 0; i < len / 2; i ++) {
            if (s.charAt(i) != s.charAt(len - i - 1))
                return false;
        }
        
        return true;
    }
}