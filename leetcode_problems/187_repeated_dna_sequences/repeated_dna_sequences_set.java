class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() == 0) return new ArrayList<>();
        List<String> result = new ArrayList<>();
        Set<String> comb = new HashSet<>();
        
        for (int i = 0; i < s.length() - 9; i ++) {
            String curr = s.substring(i, i + 10);
            if (comb.contains(curr) && !result.contains(curr))
                result.add(curr);
            else
                comb.add(curr);
        }
        
        return result;
    }
}