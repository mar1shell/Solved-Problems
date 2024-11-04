class MinStack {
    struct Node {
        int val;
        int minVal;
        Node *next;

        Node(int value) : val(value), minVal(value), next(nullptr) {};
    };

    Node *head;
    Node *tail;
public:
    MinStack() : head(nullptr), tail(nullptr) {};
    
    void push(int val) {
        if (head == nullptr) {
            head = tail = new Node(val);
            head->minVal = val;
        } else {
            Node *current = new Node(val);
            current->next = head;
            current->minVal = (val < head->minVal) ? val : head->minVal;
            head = current;
        }
    }
    
    void pop() {
        if (head != nullptr) {
            Node *newhead = head->next;
            delete head;
            head = newhead;
        }
    }
    
    int top() {
        return head->val;
    }
    
    int getMin() {
        return head->minVal;
    }
};

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack* obj = new MinStack();
 * obj->push(val);
 * obj->pop();
 * int param_3 = obj->top();
 * int param_4 = obj->getMin();
 */
