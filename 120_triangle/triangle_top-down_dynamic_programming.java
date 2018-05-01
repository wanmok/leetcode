class Solution {
    // this is a top-down dp solution
    // it is a little bit difficult to reduce the memory usage to O(n)
    // because of a more complex comparison between shared branch

    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        if (n == 0) return 0;
        if (triangle.get(0).size() == 0) return 0;
        
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i ++) {
            for (int j = i; j >= 0; j --) {
                // how to determine which to store in the dp array
                // resulting in more computing than bottom-up solution
                if (j < i) {
                    dp[j] = Math.min(dp[Math.max(j - 1, 0)], dp[j]) + triangle.get(i).get(j);
                } else
                    dp[j] = dp[Math.max(j - 1, 0)] + triangle.get(i).get(j);
            }
        }
        
        int min = Integer.MAX_VALUE;
        for (int num : dp)
            if (num < min)
                min = num;
        
        return min;
    }
}