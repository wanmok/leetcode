class Solution {
    // @COMPANY Facebook
    // @KEYWORD Hash Map, Two Pointers
    // @NOTE Remember to define the boundary and figure out how many possible cases. Moreover, the code can be more clean.
    public int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int max = 0;
        int p1=0, p2=0;
        
        while (p2 < s.length()) {
            if (hash.contains(s.charAt(p2))) {
                if (p2 - p1 > max)
                    max = p2 - p1;
                
                while (p1 < p2) {
                    if (s.charAt(p1) == s.charAt(p2)) {
                        p1 ++;
                        break;
                    }
                    hash.remove(s.charAt(p1));
                    p1 ++;
                }
            }
            hash.add(s.charAt(p2));
            p2 ++;
        }
        
        return hash.size() > max ? hash.size() : max;
    }
}