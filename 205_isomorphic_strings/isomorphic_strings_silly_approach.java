class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        
        Map<Integer, Integer> dict = new HashMap<>();
        Map<Integer, Integer> dict2 = new HashMap<>();
        
        int count = 1;
        StringBuilder sn = new StringBuilder(s.length());
        for (int i = 0; i < s.length(); i ++) {
            Integer curr = s.charAt(i) - 'a';
            if (dict.containsKey(curr))
                sn.append(dict.get(curr));
            else {
                dict.put(curr, count);
                sn.append(dict.get(curr));
                count ++;
            }
        }
        
        count = 1;
        StringBuilder tn = new StringBuilder(t.length());
        for (int i = 0; i < t.length(); i ++) {
            Integer curr = t.charAt(i) - 'a';
            if (dict2.containsKey(curr))
                tn.append(dict2.get(curr));
            else {
                dict2.put(curr, count);
                tn.append(dict2.get(curr));
                count ++;
            }
        }
        
        if (sn.toString().compareTo(tn.toString()) == 0)
            return true;
        else
            return false;
    }
}