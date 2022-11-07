class Solution {
    // @COMPANY Facebook
	// @KEYWORD Math, String
    // @NOTE Using array to simply deal with the numbers. No need to care about carry and StringBuilder uses.
    
    public String multiply(String num1, String num2) {
        int len1 = num1.length(), len2 = num2.length();
        int[] temp = new int[len1+len2];
        
        for (int i = len1-1; i >= 0; i --) {
            for (int j = len2-1; j >= 0; j --) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int p1 = i + j, p2 = i + j + 1;  // This indexing is really tricky.
                int sum = mul + temp[p2];
                
                temp[p1] += sum / 10;
                temp[p2] = sum % 10;
            }
        }
        
        StringBuilder res = new StringBuilder();
        for (int n : temp) if (!(res.length() == 0 && n == 0)) res.append(n);
        return res.length() == 0 ? "0" : res.toString();
    }
}