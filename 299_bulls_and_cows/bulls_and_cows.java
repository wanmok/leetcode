class Solution {
    public String getHint(String secret, String guess) {
        Map<Integer, Integer> tbl = new HashMap<>();
        int bull = 0, cow = secret.length();
        
        for (int i = 0; i < secret.length(); i ++) {
            int ai = secret.charAt(i) - '0';
            int bi = guess.charAt(i) - '0';
            if (ai == bi) {
                bull ++;
            } else {
                Integer curr_a = tbl.get(ai);
                Integer curr_b = tbl.get(bi);
                if (curr_a == null) tbl.put(ai, -1);
                else tbl.put(ai, -- curr_a);
                if (curr_b == null) tbl.put(bi, 1);
                else tbl.put(bi, ++ curr_b);
            }
        }
        cow -= bull;
        for (Integer i: tbl.values())
            cow -= Math.max(i, 0);
        
        return String.format("%dA%dB", bull, cow);
    }
}