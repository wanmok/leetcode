class Solution {
    public boolean isHappy(int n) {
        Set<Integer> repeat = new HashSet<>();
        
        while (n != 1) {
            int sum = 0;
            while (n != 0){
                sum += Math.pow(n % 10, 2);
                n /= 10;
            }
            if (repeat.contains(sum)) {
                return (false);
            }
            repeat.add(sum);
            n = sum;
        }
        return (true);
    }
}