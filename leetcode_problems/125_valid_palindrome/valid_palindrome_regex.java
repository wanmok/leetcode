class Solution {
    // @COMPANY Facebook
    // @KEYWORD String, Two Pointers
    // @NOTE This is quite tricky.....
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        
        String modS = s.replaceAll("\\W", "").toLowerCase();
        int i = 0, j = modS.length() - 1;
        while (i <= j) {
            if (modS.charAt(i) != modS.charAt(j)) return false;
            i ++;
            j --;
        }
        
        return true;
    }
}