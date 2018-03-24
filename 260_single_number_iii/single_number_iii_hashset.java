class Solution {
    public int[] singleNumber(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        
        for (int num : nums) {
            if (! num_set.add(num))
                num_set.remove(num);
        }
        
        Integer[] integers = num_set.toArray(new Integer[num_set.size()]);
        int[] ints = {integers[0], integers[1]};
        return (ints);
    }
}