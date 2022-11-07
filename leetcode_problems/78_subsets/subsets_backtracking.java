class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>());
        solve(result, new ArrayList<>(), 0, nums);
        return (result);
    }
    
    private void solve(List<List<Integer>> lst, List<Integer> temp, int start, int[] nums) {
        if (start == nums.length)
            return ;
        
        for (int i = start; i < nums.length; i ++) {
            temp.add(nums[i]);
            lst.add(new ArrayList<>(temp));
            solve(lst, temp, i + 1, nums);
            temp.remove(temp.size() - 1);
        }
    }
}