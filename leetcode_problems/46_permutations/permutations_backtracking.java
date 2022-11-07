class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        solve(result, new ArrayList<>(), nums);
        return (result);
    }
    
    public void solve(List<List<Integer>> lst, List<Integer> temp_lst, int[] nums) {
        if (temp_lst.size() == nums.length){
            lst.add(new ArrayList<Integer>(temp_lst));
        } else {
            for (int num : nums) {
                if (temp_lst.contains(num)) 
                    continue;
                temp_lst.add(num);
                solve(lst, temp_lst, nums);
                temp_lst.remove(temp_lst.size() - 1);
            }
        }
    }
}