class Solution {
    // @COMPANY Facebook
    // @KEYWORD String
    // @NOTE Identify the number and do the operation. When to do operation?
    public int calculate(String s) {
        Deque<Integer> stack = new LinkedList<>();
        
        int j = 0;
        int operand = 0;
        char operator = '+';
        for (int i = 0; i < s.length(); i ++) {
            if ((Character.isDigit(s.charAt(i)) || s.charAt(i) == ' ') && i != s.length()-1)
                continue;
            operand = Integer.valueOf(s.substring(j, i == s.length() - 1 ? i + 1 : i).trim());
            j = i + 1;
            if (operator == '+')
                stack.offerLast(operand);
            else if (operator == '-')
                stack.offerLast(-operand);
            else if (operator == '*')
                stack.offerLast(stack.pollLast() * operand);
            else if (operator == '/')
                stack.offerLast(stack.pollLast() / operand);            
            operator = s.charAt(i);
        }
        
        int result = 0;
        for (int i: stack)
            result += i;
        
        return result;
    }
}