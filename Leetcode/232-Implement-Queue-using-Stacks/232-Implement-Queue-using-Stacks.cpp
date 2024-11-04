class MyQueue {
    stack<int> stack1;
    stack<int> stack2;
public:
    MyQueue() {
        
    }
    
    void push(int x) {
        stack1.push(x);
    }
    
    int pop() {
        if (!stack2.empty()) {
            int top = stack2.top();
            stack2.pop();
            
            return top;
        }
        while (!stack1.empty()) {
            int current = stack1.top();
            stack1.pop();
            stack2.push(current);
        }

        int top = stack2.top();
        stack2.pop();

        return top;
    }
    
    int peek() {
        if (!stack2.empty()) {
            int top = stack2.top();

            return top;
        }

        while (!stack1.empty()) {
            int current = stack1.top();
            stack1.pop();
            stack2.push(current);
        }

        return stack2.top();
    }
    
    bool empty() {
        return stack1.empty() && stack2.empty();
    }
};

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue* obj = new MyQueue();
 * obj->push(x);
 * int param_2 = obj->pop();
 * int param_3 = obj->peek();
 * bool param_4 = obj->empty();
 */
