class MyLinkedList {
    struct node {
        int data;
        node *next;
    };

    node *head;
    node *tail;
public:
    MyLinkedList() : head(nullptr), tail(nullptr) {}
    
    int get(int index) {
        node *temp = head;

        for (int i = 0; i < index; i++) {
            if (temp != nullptr) {
                temp = temp->next;
            } else {
                return -1;
            }
        }

        return (temp != nullptr) ? temp->data : -1;
    }
    
    void addAtHead(int val) {
        node *temp = new node;
        temp->data = val;
        temp->next = head;
        head = temp;
        
        if (tail == nullptr) {
            tail = head;
        }
    }
    
    void addAtTail(int val) {
        node *temp = new node;
        temp->data = val;
        temp->next = nullptr;

        if (tail == nullptr) {
            head = temp;
            tail = temp;
        } else {
            tail->next = temp;
            tail = temp;
        }
    }
    
    void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }

        node *temp1 = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp1 == nullptr) {
                return;
            }

            temp1 = temp1->next;
        }

        if (temp1 == nullptr) return;

        node *temp2 = new node;
        temp2->data = val;
        temp2->next = temp1->next;
        temp1->next = temp2;
        if (temp2->next == nullptr) {
            tail = temp2;
        }
    }
    
    void deleteAtIndex(int index) {
        if (head == nullptr) {
            return;
        }

        if (index == 0) {
            node *temp = head;
            head = head->next;
            delete temp;

            if (head == nullptr) {
                tail = nullptr;
            }

            return;
        }

        node *temp1 = head;

        for (int i = 0; i < index - 1; i++) {
            if (temp1 == nullptr || temp1->next == nullptr) {
                return;
            }

            temp1 = temp1->next;
        }

        node *temp2 = temp1->next;
        
        if (temp2 == nullptr) {
            return;
        }

        temp1->next = temp2->next;

        if (temp1->next == nullptr) {
            tail = temp1;
        }

        delete temp2;
    }
};
