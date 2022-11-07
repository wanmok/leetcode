class Solution {
    public int numTrees(int n) {

        // TODO (WanMok) The formula can be simplified.....

        List<Integer> dp = new ArrayList<>();
        
        if (n == 1)
            return (1);
        else if (n == 2)
            return (2);
        
        dp.add(0, 1);
        dp.add(1, 1);
        dp.add(2, 2);
    
        for (int i = 3; i <= n; i ++) {
            int result = 0;
            
            for (int j = 1; j <= i / 2; j ++) 
                result += 2 * dp.get(i - j) * dp.get(j - 1);
            
            if (i % 2 == 1)
                result += dp.get(i / 2) * dp.get(i / 2);
            
            dp.add(i, result);
        }
        
        return (dp.get(n));
        
    }
}