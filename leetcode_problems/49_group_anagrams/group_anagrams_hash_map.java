class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int len = strs.length;
        if (len == 0) return (new ArrayList<>()); // end before start

        // List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        
        
        int[] a = new int[26];
        for (String s : strs) {
            //int[] a = new int[26];
            
            Arrays.fill(a, 0);
            
            for (int j = 0; j < s.length(); j ++) 
                a[s.charAt(j) - 'a'] ++;
            
            StringBuilder map_key_builder = new StringBuilder(26);
            for (int j = 0; j < a.length; j ++) 
                map_key_builder.append(a[j]);
            String map_key = map_key_builder.toString();
            
            if (! mp.containsKey(map_key)) 
                mp.put(map_key, new ArrayList<>());
            
            mp.get(map_key).add(s);
        }
        
        // for (Map.Entry<String, List<String>> e : mp.entrySet()) 
        //     result.add(e.getValue());
    
        // return (result);

        return (new ArrayList(mp.values()));
        
    }
}