class Solution {
public:
    bool isValid(string s) {
        stack<char> parStack;

        for (auto c : s) {
            if (c == '(' || c == '[' || c == '{') {
                parStack.push(c);
            } else {
                if (parStack.empty()) {
                    return false;
                }

                char current = parStack.top();
                
                switch (c) {
                    case ')':
                        if (current == '(') {
                            parStack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case ']':
                        if (current == '[') {
                            parStack.pop();
                        } else {
                            return false;
                        }
                        break;
                    case '}':
                        if (current == '{') {
                            parStack.pop();
                        } else {
                            return false;
                        }
                        break;
                }
            }
        }

        return (parStack.empty()) ? true : false;
    }
};
