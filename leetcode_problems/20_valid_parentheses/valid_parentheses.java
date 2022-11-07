class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new LinkedList<>();
        
        for (int i = 0; i < s.length(); i ++) {
            char curr = s.charAt(i);
            switch (curr) {
                case '{':
                    stack.offerLast('}');
                    break;
                case '[':
                    stack.offerLast(']');
                    break;
                case '(':
                    stack.offerLast(')');
                    break;
                case '}':
                case ']':
                case ')':
                    if (stack.isEmpty()) return false;
                    char left = stack.pollLast();
                    if (left != curr)
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}