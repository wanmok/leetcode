class Solution {
    public String addStrings(String num1, String num2) {
        int s1 = num1.length() - 1, s2 = num2.length() - 1;
        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        while (s1 >= 0 || s2 >= 0) {
            int sum = (s1 >= 0 ? num1.charAt(s1) - '0' : 0) 
                + (s2 >= 0 ? num2.charAt(s2) - '0' : 0)
                + carry;
            if (sum > 9) carry = 1;
            else carry = 0;
            sum %= 10;
            sb.insert(0, sum);
            s1 --;
            s2 --;
        }
        if (carry == 1) sb.insert(0, 1);
        
        return sb.toString();
    } 
}