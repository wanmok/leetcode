class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        
        while (i >= 0) {
            if (digits[i] + 1 > 9) {
                digits[i] = 0;
            } else {
                digits[i] ++;
                break;
            }
            
            i --;
        } 
        
        if (digits[0] == 0) {
            int[] temp = new int[digits.length + 1];
            temp[0] = 1;
            for (int j = 0; j < digits.length; j ++) {
                temp[j + 1] = digits[j];
            }
            
            digits = temp;
        }
        
        return (digits);
    }
}