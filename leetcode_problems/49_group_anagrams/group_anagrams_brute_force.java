class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        
        for (String s : strs) {
            int i = 0;
            for (; i < result.size(); i ++) {
                if (is_anagram(result.get(i).get(0), s)) {
                    result.get(i).add(s);
                    break;
                } 
            }
            if (i == result.size()) {
                result.add(new ArrayList<>());
                result.get(i).add(s);
            }
        }
        
        return (result);
        
    }
    
    private boolean is_anagram(String a, String b) {
        if (a.length() != b.length())
            return (false);
        
        int[] alphabets = new int[26];
        for (int i = 0; i < a.length(); i ++) {
            alphabets[a.charAt(i) - 'a'] ++;
            alphabets[b.charAt(i) - 'a'] --;
        }
        
        for (int i : alphabets) {
            if (i != 0)
                return (false);
        }
        
        return (true);
    }
}