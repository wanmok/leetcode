class Solution {
    // @COMPANY Facebook
    // @KEYWORD String, Bracktracking
    // @NOTE End criteria? Operator priority! Also, don't forget the corner case.
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<>();  // Don't forget if digits == ""
        
        List<String> result = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        
        solve(digits, 0, sb, result);
        
        return result;
    }
    
    private void solve(String digits, int index, StringBuilder path, List<String> result) {
        if (index == digits.length()) {
            result.add(path.toString());
            return ;
        }
            
        int num = digits.charAt(index) - '0';
        int start = 3 * (num - 2) + (num > 7 ? 1 : 0);  // Priority!
        int end = start + 3 + ((num == 7 || num == 9) ? 1 : 0 );
        
        for (int i = start; i < end; i ++) {
            path.append((char)(i + 'a'));
            solve(digits, index + 1, path, result);
            path.deleteCharAt(path.length() - 1);
        }
    }
}