/*structure of a node of the linked list is as
struct Node
{
    int data;
    struct Node* next;

    Node(int x){
        data = x;
        next = NULL;
    }

};
*/
class Solution {
  public:
    bool isLengthEven(struct Node **head) {
        Node *temp = *head; 
        int count = 0;
        
        while (temp != nullptr) {
            count++;
            temp = temp->next;
        }
        
        return (count % 2 == 0) ? true : false;
    }
};
