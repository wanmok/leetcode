class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return (new ArrayList<>());
        
        List<String> result = new ArrayList<>();
        solve(result, new StringBuilder(digits.length()), digits, 0);
        return result;
    }
    
    private void solve(List<String> result, StringBuilder temp, String digits, int start) {
        if (start == digits.length()) {
            result.add(temp.toString());
            return ;
        }
        
        int num = digits.charAt(start) - '0';
        int is_four = (num == 9 || num == 7) ? 1 : 0;
        int base = 'a' + (num - 2) * 3 + (num > 7 ? 1 : 0);
        for (int i = 0; i < 3 + is_four; i ++) {
            char curr = (char)(base + i);
            temp.append(curr);
            solve(result, temp, digits, start + 1);
            temp.deleteCharAt(temp.length() - 1);
        }
    }
}