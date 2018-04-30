class Solution {
    // this is a tricky solution
    // the same pattern is mapped to index related number
    // instead of a consistant mapping method
    public boolean isIsomorphic(String s, String t) {
        if (s.length() == 0) return true;
        
        // according to ASCII
        int[] smap = new int[256];
        int[] tmap = new int[256];
        
        for (int i = 0; i < s.length(); i ++) {
            int scurr = s.charAt(i), tcurr = t.charAt(i);
            if (smap[scurr] != tmap[tcurr]) return false;
            
            smap[scurr] = i + 1;
            tmap[tcurr] = i + 1;
        }
        
        return true;
    }
}