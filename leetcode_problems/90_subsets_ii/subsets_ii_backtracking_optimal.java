class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<>();
        
        solve(result, new ArrayList<>(), nums, 0);
        
        return (result);
    }
    
    private void solve(List<List<Integer>> result, List<Integer> temp, int[] nums, int start) {

        result.add(new ArrayList(temp));
        
        for (int i = start; i < nums.length; i ++) {
            // how to prevent duplicates in the same layer of iteration
            if (i > start && nums[i - 1] == nums[i]) continue;
            
            temp.add(nums[i]);
            solve(result, temp, nums, i + 1);
            temp.remove(temp.size() - 1);
        }
    }
}