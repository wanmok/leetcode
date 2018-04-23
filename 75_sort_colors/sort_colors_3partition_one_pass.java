class Solution {
    public void sortColors(int[] nums) {
        // https://en.wikipedia.org/wiki/Dutch_national_flag_problem
        
        // remember what will be used to locate the element groups
        int pos_one = 0, pos_zero = 0;
        for (int i = 0; i < nums.length; i ++) {
            int temp = nums[i];
            
            nums[i] = 2;
            
            if (temp < 2) {
                nums[pos_one] = 1;
                pos_one ++;
            }
            
            if (temp == 0) {
                nums[pos_zero] = 0;
                pos_zero ++;
            }
        }
    }
}