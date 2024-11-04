class Solution:
    def evalRPN(self, tokens):
        stack = []

        for op in tokens:
            if op in {"+", "-", "*", "/"}:
                b = stack.pop()
                a = stack.pop()

                if op == "+":
                    stack.append(a + b)
                elif op == "-":
                    stack.append(a - b)
                elif op == "*":
                    stack.append(a * b)
                elif op == "/":
                    stack.append(int(a / b))
            else:
                    stack.append(int(op))

        return stack[0]
