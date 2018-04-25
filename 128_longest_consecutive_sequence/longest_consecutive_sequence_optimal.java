class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return (0);
        
        Set<Integer> num_set = new HashSet<>();
        for (int num : nums)
            num_set.add(num);
        
        int current_len, max_len = 0;
        for (int num : nums) {
            // interesting and tricky approach
            // make sure this is the start of sequence
            if (! num_set.contains(num - 1)) { 
                current_len = 1;
                
                int temp = num;
                while (num_set.contains(++ temp))
                    current_len ++;
                
                if (current_len > max_len)
                    max_len = current_len;
            }
        }
        
        return (max_len);
    }
}