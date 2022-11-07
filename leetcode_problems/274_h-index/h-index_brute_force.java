class Solution {
    // this is what called brute force =.=

    public int hIndex(int[] citations) {
        if (citations.length == 0) return 0;
        int h = 0;
        
        while (h_count(citations, h + 1) >= (h + 1)) {
            h ++;
        }
        return h;
    }
    
    private int h_count(int[] citations, int h) {
        int count = 0;
        for (int i = 0; i < citations.length; i ++) {
            if (citations[i] >= h)
                count ++;
        }
        return count;
    }
}