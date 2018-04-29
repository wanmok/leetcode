class Solution {
    // well... using a hashmap to remove the duplicates is quite a silly approach...

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        Map<String, List<Integer>> result = new HashMap<>();
        solve(result, candidates, target, 0, new StringBuilder(), new ArrayList<>());
        return (new ArrayList(result.values()));
    }
    
    private void solve(Map<String, List<Integer>> result, int[] candidates, int target, int start, StringBuilder temp_s, List<Integer> temp) {
        if (target == 0) {
            String key = temp_s.toString();
            if (!result.containsKey(key))
                result.put(key, new ArrayList(temp));
        }
        
        for (int i = start; i < candidates.length; i ++) {
            if (target < candidates[i]) break;
            String curr = String.valueOf(candidates[i]);
            temp_s.append(curr);
            temp.add(candidates[i]);
            solve(result, candidates, target - candidates[i], i + 1, temp_s, temp);
            // start inclusive end exclusive
            temp_s.delete(temp_s.length() - curr.length(), temp_s.length());
            temp.remove(temp.size() - 1);
        }
    }
}