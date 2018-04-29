class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        solve(result, candidates, target, 0, new ArrayList<>());
        return result;
    }
    
    private void solve(List<List<Integer>> result, int[] candidates, int target, int start, List<Integer> path) {
        if (target == 0) result.add(new ArrayList(path));
        
        for (int i = start; i < candidates.length; i ++) {
            if (target < candidates[i]) return;
            // important condition
            // don't insert the same number at the same level
            if (i > start && candidates[i] == candidates[i - 1]) continue;
            path.add(candidates[i]);
            solve(result, candidates, target - candidates[i], i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}