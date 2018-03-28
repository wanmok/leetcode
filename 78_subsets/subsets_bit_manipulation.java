class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int elem_num = nums.length;
        int set_num = (int)Math.pow(2, elem_num);
        List<Integer>[] result = new List[set_num];
        
        result[0] = new ArrayList<>();
        for (int i = 0; i < elem_num; i ++) {
            for (int j = 0; j < set_num; j ++) {
                if (((j >> i) & 1 )== 1) {
                    if (result[j] == null)
                        result[j] = new ArrayList<>();
                    result[j].add(nums[i]);
                }
            }
        }
        return (Arrays.asList(result));
    }
}