# Intuition
This problem is about validating if a string containing only the characters `'('`, `')'`, `'{'`, `'}'`, `'['`, and `']'` is valid. A string is valid if:
1. Every open bracket has a corresponding close bracket of the same type.
2. Open brackets are closed in the correct order (i.e., nested correctly).

Using a stack allows us to efficiently keep track of the most recent unmatched open bracket, making it easy to validate the matching of brackets as we parse the string.

# Approach
1. Initialize an empty stack `parStack` to keep track of open brackets.
2. Loop through each character in the string `s`:
   - If the character is an opening bracket (`'('`, `'{'`, or `'['`), push it onto the stack.
   - If the character is a closing bracket (`')'`, `'}'`, or `']'`):
     - Check if the stack is empty (indicating there’s no corresponding open bracket). If empty, return `false`.
     - Otherwise, pop the top of the stack and check if it matches the current closing bracket. If it doesn’t match, return `false`.
3. After the loop, if the stack is empty, all brackets were properly matched, so return `true`. If not, return `false`.

# Complexity
- **Time complexity**: $$O(n)$$, where $$n$$ is the length of the string. Each character is pushed and popped from the stack at most once.
- **Space complexity**: $$O(n)$$, as in the worst case, we may push all open brackets onto the stack.
