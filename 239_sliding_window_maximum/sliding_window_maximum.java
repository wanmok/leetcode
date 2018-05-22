class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        
        Deque<Integer> q = new LinkedList<>();
        
        int n = nums.length;
        int[] result = new int[n - k + 1];
        int p = 0;
        
        for (int i = 0; i < n; i ++) {
            while (! q.isEmpty() && q.peekFirst() < i - k + 1)
                q.pollFirst();
            
            while (! q.isEmpty() && nums[q.peekLast()] < nums[i])
                q.pollLast();
            
            q.offerLast(i);
            
            if (i >= k - 1) 
                result[p ++] = nums[q.peekFirst()];
        }
        
        return result;
    }
}