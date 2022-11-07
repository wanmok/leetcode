class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        
        do {
            slow = sum_square(slow);
            fast = sum_square(sum_square(fast));
        } while (slow != fast);
        if (slow == 1)
            return (true);
        else
            return (false);
    }
    
    private int sum_square(int n) {
        int sum = 0;
        while (n != 0) {
            sum += Math.pow(n % 10, 2);
            n /= 10;
        }
        return (sum);
    }
}