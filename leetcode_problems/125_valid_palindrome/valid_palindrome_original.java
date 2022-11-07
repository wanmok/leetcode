class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char currA = s.charAt(i);
            if (currA >= 'A' && currA <= 'Z')
                currA = (char)(currA - 'A' + 'a');
            if ((currA < 'a' || currA > 'z') 
                && (currA < '0' || currA > '9')) {
                i ++;
                continue;
            }
            
            char currB = s.charAt(j);
            if (currB >= 'A' && currB <= 'Z')
                currB = (char)(currB - 'A' + 'a');
            if ((currB < 'a' || currB > 'z') 
                && (currB < '0' || currB > '9')) {
                j --;
                continue;
            }
            
            if (currA != currB) return false;
            
            i ++;
            j --;
        }
        
        return true;
    }
}