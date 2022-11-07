class Solution {
    public int lengthOfLastWord(String s) {
        int lastSpace = -1, tailingSpaces = 0;
        
        int j = s.length() - 1;
        while (j >= 0 && s.charAt(j) == ' ')
            j --;
        tailingSpaces = s.length() - j - 1;
        
        for (int i = 0; i < s.length() - tailingSpaces; i ++) {
            if (s.charAt(i) == ' ')
                lastSpace = i;
        }
        
        int res = s.length() - lastSpace - 1 - tailingSpaces;
        return res >= 0 ? res : 0;
    }
}