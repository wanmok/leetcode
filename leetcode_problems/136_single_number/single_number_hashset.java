class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> num_set = new HashSet<Integer>();
        
        for (int num: nums) {
            if (! num_set.add(num)) {
                num_set.remove(num);
            }
        }
        
        Iterator<Integer> it = num_set.iterator();
        return (it.next());
    }
}