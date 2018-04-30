class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        
        int[] smap = new int[256];
        int[] tmap = new int[256];
        
        int count = 0;
        for (int i = 0; i < s.length(); i ++) {
            int scurr = s.charAt(i), tcurr = t.charAt(i);
            if (smap[scurr] == 0 || tmap[tcurr] == 0) count ++;
            if (smap[scurr] == 0) smap[scurr] = count;
            if (tmap[tcurr] == 0) tmap[tcurr] = count;
            if (smap[scurr] != tmap[tcurr]) return false;
        }
        
        return true;
    }
}