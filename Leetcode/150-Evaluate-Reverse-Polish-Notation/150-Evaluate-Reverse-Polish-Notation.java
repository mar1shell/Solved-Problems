class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        int operand1, operand2;

        for (String token : tokens) {
            switch (token) {
                case "+":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 + operand2);
                    break;
                case "*":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 * operand2);
                    break;
                case "/":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 / operand2);
                    break;
                case "-":
                    operand2 = stack.pop();
                    operand1 = stack.pop();
                    stack.push(operand1 - operand2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }
}