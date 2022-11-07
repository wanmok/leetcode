class Solution {
    // @COMPANY Facebook
    // @KEYWORD Math, String
    // @NOTE Take care of loop criteria and null pointer.
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        
        while (i >= 0 || j >= 0) {
            int num1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int num2 = j >= 0 ? b.charAt(j) - '0' : 0;
            int sum = num1 + num2 + carry;
            int remain = sum % 2;
            carry = sum / 2;
            result.insert(0, remain);
            i --;
            j --;
        }
        if (carry != 0)
            result.insert(0, carry);
        
        return result.toString();
    }
}