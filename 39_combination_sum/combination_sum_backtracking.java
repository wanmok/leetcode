class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, null, candidates, target, 0);
        return (result);
    }
    
    private void solve(List<List<Integer>> lst, List<Integer> current, int[] candidates, int target, int bound) {
        if (target == 0) {
            lst.add(new ArrayList<>(current));
            return ;
        }
        
        for (int i = bound; i < candidates.length; i ++) {
            if (current == null)
                current = new ArrayList<>();
            
            if (target < candidates[i])
                continue ;
            
            current.add(candidates[i]);
            solve(lst, current, candidates, target - candidates[i], i);
            current.remove(current.size() - 1);
        }
    }
}