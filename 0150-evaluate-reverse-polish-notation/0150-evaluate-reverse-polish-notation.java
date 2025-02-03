class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            int result = 0;
            if (isOperator(token)) {
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                if (token.equals("+")) {
                    result = num1 + num2;
                } else if (token.equals("-")) {
                    result = num1 - num2;
                } else if (token.equals("*")) {
                    result = num1 * num2;
                } else if (token.equals("/")) {
                    result = num1 / num2;
                }
                stack.push(Integer.toString(result));
            } else {
                stack.push(token);
            }
        }
        return Integer.parseInt(stack.peek());
    }

    private boolean isOperator(String token) {
        if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
            return true;
        }
        return false;
    }
}