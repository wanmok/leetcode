class Solution {
    // @COMPANY Facebook
    // @KEYWORD Array, Backtracking, Bit Manipulation
    // @NOTE A very basic backtracking problem. The point is that you have to avoid duplicate elements.
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new LinkedList<>();
        result.add(new ArrayList<>());
        
        solve(nums, result, new LinkedList<>(), 0);
        
        return result;
    }
    
    private void solve(int[] nums, List<List<Integer>> result, List<Integer> path, int start) {
        if (start == nums.length) return;
        
        for (int i = start; i < nums.length; i ++) {
            path.add(nums[i]);
            result.add(new ArrayList<>(path));
            solve(nums, result, path, i + 1);  // don't forget how many elements left
            path.remove(path.size() - 1);
        }
    }
}