class MyCircularQueue {
    vector<int> queue;
    int length;
    int rear;
    int front;
public:
    MyCircularQueue(int k) {
        this->length = k;
        this->rear = -1;
        this->front = -1;
        this->queue.resize(k);
    }
    
    bool enQueue(int value) {
        if (isFull()) {
            return false;
        }

        if (isEmpty()) {
            this->rear = this->front = 0;
            this->queue[this->rear] = value;
            return true;
        }


        this->rear = (this->rear + 1) % length;
        this->queue[this->rear] = value;

        return true;
    }
    
    bool deQueue() {
        if (!isEmpty()) {
            if (this->front == this->rear) {
                this->front = this->rear = -1;
                return true;
            }

            this->front = (this->front + 1) % length;

            return true;
        }

        return false;
    }
    
    int Front() {
        if (!isEmpty()) {
            return this->queue[this->front];
        }
        
        return -1;
    }
    
    int Rear() {
        if (!isEmpty()) {
            return this->queue[this->rear];
        }
        
        return -1;
    }
    
    bool isEmpty() {
        if (this->front == -1) {
            return true;
        }

        return false;
    }
    
    bool isFull() {
        if (this->front == (this->rear + 1) % length) {
            return true;
        }

        return false;
    }
};

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue* obj = new MyCircularQueue(k);
 * bool param_1 = obj->enQueue(value);
 * bool param_2 = obj->deQueue();
 * int param_3 = obj->Front();
 * int param_4 = obj->Rear();
 * bool param_5 = obj->isEmpty();
 * bool param_6 = obj->isFull();
 */
