class Solution {
    // @COMPANY Facebook
	// @KEYWORD Math, String
    // @NOTE Take care of the edge and think clearly about how to simulate the multiplication process.
    
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        
        int len1 = num1.length()-1, len2 = num2.length()-1;
        StringBuilder res = new StringBuilder();
        int carry = 0;
        
        for (int i = len1; i >= 0; i --) {
            int a = num1.charAt(i) - '0';
            for (int j = len2; j >= 0; j --) {
                int b = num2.charAt(j) - '0';
                int pos = len1 - i + len2 - j;
                int current = pos >= res.length() ? 0 : res.charAt(pos) - '0';
                int product = a * b + carry + current;
                int remain = product % 10;
                carry = product / 10;
                if (pos >= res.length())
                    res.append(remain);
                else
                    res.setCharAt(pos, (char)(remain + '0'));
            }
            if (carry > 0) {
                res.append(carry);
                carry = 0;
            }
        }
        
        return res.reverse().toString();
    }
}