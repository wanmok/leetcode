class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("", new ArrayList());
        
        solve(result, new ArrayList<>(), nums, 0);
        
        return (new ArrayList(result.values()));
    }
    
    private void solve(Map<String, List<Integer>> result, List<Integer> temp, int[] nums, int start) {
        if (start == nums.length) return;
        
        for (int i = start; i < nums.length; i ++) {
            temp.add(nums[i]);
            Integer[] a = temp.toArray(new Integer[temp.size()]);
            Arrays.sort(a);
            StringBuilder s = new StringBuilder(a.length);
            
            for (Integer n : a)
                s.append(n);
            
            String key = s.toString();
            if (! result.containsKey(key))
                result.put(key, new ArrayList(temp));
            solve(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}