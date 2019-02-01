class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Simple question. Just figure out the relationship among the words. Very similar to parsing!
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean[] memo = new boolean[s.length()];
        
        for (int i = 0; i < s.length(); i ++) {
            for (String word: wordDict) {
                if (i - word.length() >= 0 && !memo[i-word.length()])
                    continue;
                if (s.substring(Math.max(i-word.length()+1, 0), i+1).equals(word))
                    memo[i] = true;
            }
        }
        
        return memo[s.length()-1];
    }
}