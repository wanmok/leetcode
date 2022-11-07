class Solution {
    // @COMPANY Facebook
    // @KEYWORD Dynamic Programming
    // @NOTE Remember to identify the variables invovled and figure out what will be the base case. boolean not bool...\\ s.subtring(a, b) is [a, b)
    public int climbStairs(int n) {
        if (n == 1)
            return (1);
        else if (n == 2)
            return (2);
        
        int n_1 = 1;
        int n_2 = 2;
        int result = 2;
        for (int i = 3; i <= n; i ++) {
            n_2 = result;
            result = n_1 + n_2;
            n_1 = n_2;
        }
        
        return (result);
    }
}