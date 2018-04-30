class Solution {
    public int hIndex(int[] citations) {
        int len = citations.length;
        if (len == 0) return 0;
        int[] idx = new int[len + 1];
        
        for (int i = 0; i < len; i ++) {
            if (citations[i] >= len) idx[len] ++;
            else idx[citations[i]] ++;
        }
        
        int acc = 0;
        for (int i = len; i >= 0; i --) {
            acc += idx[i];
            if (acc >= i) return i;
        }
        
        return 0;
    }
}