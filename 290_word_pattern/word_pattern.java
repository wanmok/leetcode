class Solution {
    public boolean wordPattern(String pattern, String str) {
        if (pattern.length() == 0 && str.length() == 0) return true;
        
        String[] s = str.split(" ");
        if (s.length != pattern.length()) return false;
        
        Map<String, Integer> dict1 = new HashMap<>();
        Map<String, Integer> dict2 = new HashMap<>();
        
        for (int i = 0; i < pattern.length(); i ++) {
            String scurr = s[i];
            String pcurr = String.valueOf(pattern.charAt(i));
            int si = dict1.get(scurr) != null ? dict1.get(scurr) : -1;
            int pi = dict2.get(pcurr) != null ? dict2.get(pcurr) : -1;
            if (si != pi) return false;
            dict1.put(scurr, i + 1);
            dict2.put(pcurr, i + 1);
        }
        return true;
    }
}