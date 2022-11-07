class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set num_set = new HashSet();
        
        for (int num: nums) {
            if (! num_set.add(num))
                return (true);
        }
        return (false);
    }
}