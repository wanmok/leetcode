class Solution {
    // @COMPANY Facebook
    // @KEYWORD String, Two Pointers, Hash Table
    // @NOTE How to keep sliding window? What is the loop invariant? 
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new LinkedList<>();
        int[] alphabetics = new int[26];
        
        for (char pp: p.toCharArray()) {
            alphabetics[pp-'a'] ++;
        }
        
        int start = 0, end = 0;
        int counter = p.length();
        while (end < s.length()) {
            if (alphabetics[s.charAt(end)-'a'] > 0) {
                counter --;
            }
            alphabetics[s.charAt(end)-'a'] --;
            end ++;
            
            if (counter == 0) {
                result.add(start);
            }
            
            if (end - start == p.length()) {
                if (alphabetics[s.charAt(start)-'a'] >= 0)
                    counter++;
                alphabetics[s.charAt(start)-'a']++;
                start ++;
            }
                
        }
        
        return result;
    }
}