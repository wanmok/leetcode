class Solution {
    // @COMPANY Facebook
    // @KEYWORD Two Pointers, Array, Sort
    // @NOTE Which type of two pointers problem? Actually I think this is a three pointers problem. The basic idea is that assuming different pointer moves in different speeds and can reflect the numbes of 0, 1, 2.
    
    public void sortColors(int[] nums) {
        int p_zero = 0, p_one = 0;
        
        for (int i = 0; i < nums.length; i ++) {
            int temp = nums[i];
            
            nums[i] = 2;
            
            if (temp < 2) 
                nums[p_one++] = 1;
            
            if (temp == 0)
                nums[p_zero++] = 0;
        }
    }
}