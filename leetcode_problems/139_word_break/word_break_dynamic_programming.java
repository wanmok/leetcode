class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s.length() == 0 || wordDict.size() == 0) return false;
        boolean[] dp = new boolean[s.length()];
        
        for (int i = 0; i < s.length(); i ++) {
            for (String word : wordDict) {
                if (i - word.length() >= 0 && !dp[i - word.length()]) continue;
                if (s.substring(Math.max(i - word.length() + 1, 0), i + 1).equals(word))
                    dp[i] = true;
            }
        }
        
        return dp[s.length() - 1];
    }
}