class Solution {
    // @COMPANY Facebook
    // @KEYWORD String, Stack
    // @NOTE Remember to check whether the stack is empty and find a way to code more concisely.
    public boolean isValid(String s) {
        if (s.length() == 0) return true;
        Deque<Character> stack = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i ++) {
            switch(s.charAt(i)) {
                case '(':
                    stack.offerLast(')');
                    break;
                case '[':
                    stack.offerLast(']');
                    break;
                case '{':
                    stack.offerLast('}');
                    break;
                case ')':
                case ']':
                case '}':
                    if (stack.isEmpty()) return false;  // don't forget to check the stack
                    char curr = stack.pollLast();
                    if (curr != s.charAt(i))
                        return false;
            }
        }
        
        return stack.isEmpty();
    }
}