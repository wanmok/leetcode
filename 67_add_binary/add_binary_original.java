class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(Math.max(a.length(), b.length()) + 1);
        int carry = 0;
        
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i --, j --) {
            int sum = (i >= 0 ? (a.charAt(i) - '0') : 0) + (j >= 0 ? (b.charAt(j) - '0') : 0) + carry;
            if (sum > 1) {
                carry = 1;
                result.insert(0, sum == 2 ? '0' : '1');
            } else {
                carry = 0;
                result.insert(0, sum);
            }
        }
        if (carry == 1) result.insert(0, '1');
        
        return result.toString();
    }
}