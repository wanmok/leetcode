class Solution {
    // @COMPANY Facebook
    // @KEYWORD Hash Map, Two Pointers
    // @NOTE How to reduce the passing time? Why use HashMap instead of HashSet?
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0;
        
        for (int i = 0, j = 0; j < s.length(); j ++) {
            if (map.containsKey(s.charAt(j))) {
                // Why use Math.max?
                i = Math.max(map.get(s.charAt(j)), i);
            }
            map.put(s.charAt(j), j + 1);
            ans = Math.max(ans, j - i + 1);
        }
        
        return ans;
    }
}