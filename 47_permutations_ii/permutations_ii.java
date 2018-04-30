class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        solve(result, nums, new ArrayList<>());
        return result;
    }
    
    private void solve(List<List<Integer>> result, int[] nums, List<Integer> path) {
        if (path.size() == nums.length) {
            List<Integer> temp = new ArrayList<>();
            for (Integer i : path)
                temp.add(nums[i]);
            result.add(temp);
            return ;
        }
        
        for (int i = 0; i < nums.length; i ++) {
            if (path.contains(i)) continue;
            if (i > 0 && nums[i - 1] == nums[i] && path.contains(i - 1)) continue;
            path.add(i);
            solve(result, nums, path);
            path.remove(path.size() - 1);
        }
    }
}