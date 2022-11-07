class Solution {
    public int missingNumber(int[] nums) {
        int min = 1;
        int max = 0;
        int sum = 0;
        for (int num: nums) {
            if (num < min)
                min = 0;
            if (num > max)
                max = num;
            sum += num;
        }
        if (min == 1)
            return (0);
        
        int remain = (max + 1) * max / 2 - sum;
        if (remain != 0 )
            return (remain);
        
        return (max + 1);
    }
}