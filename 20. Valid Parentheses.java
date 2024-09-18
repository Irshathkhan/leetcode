class Solution {
    public boolean isValid(String s) {
        Stack<Character> c = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '[' || s.charAt(i) == '{' || s.charAt(i) == '(') {
                c.add(s.charAt(i));
            } else if (s.charAt(i) == '}' && !c.isEmpty() && c.peek() == '{'
                    || s.charAt(i) == ')' && !c.isEmpty() && c.peek() == '('
                    || s.charAt(i) == ']' && !c.isEmpty() && c.peek() == '[') {
                c.pop();
            } else {
                return false;
            }
        }
        return (c.isEmpty());
    }
}
