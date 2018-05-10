class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<Integer> combinationSet = new HashSet<>();
        Set<Integer> duplicateSet = new HashSet<>();
        List<String> result = new ArrayList<>();
        
        if (s.length() == 0) return result;
        
        int[] map = new int[26];
        map['C' - 'A'] = 1;
        map['G' - 'A'] = 2;
        map['T' - 'A'] = 3;
        
        for (int i = 0; i < s.length() - 9; i ++) {
            int key = 0;
            for (int j = 0; j < 10; j ++) {
                key <<= 2;
                key |= map[s.charAt(i + j) - 'A'];
            }
            if (!combinationSet.add(key) && duplicateSet.add(key)) 
                result.add(s.substring(i, i + 10));
        }
        
        return result;
    }
}