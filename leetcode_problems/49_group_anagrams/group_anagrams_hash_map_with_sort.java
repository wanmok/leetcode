class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        if (len == 0) return (new ArrayList<>());
        
        Map<String, List<String>> mp = new HashMap<>();
        
        for (String s : strs) {
            char[] chs = s.toCharArray();
            Arrays.sort(chs);
            String key = String.valueOf(chs);
            if (! mp.containsKey(key))
                mp.put(key, new ArrayList<>());
            mp.get(key).add(s);
        }
    
        return (new ArrayList(mp.values()));
        
    }
}