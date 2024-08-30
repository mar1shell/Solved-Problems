class Solution {
public:
    ListNode *detectCycle(ListNode *head) {
        ListNode *temp1 = head, *temp2 = head;

        while (temp1 != nullptr && temp1->next != nullptr) {
            temp1 = (temp1->next)->next;
            temp2 = temp2->next;

            if (temp1 == temp2) {
                temp1 = head;

                while(temp1 != temp2) {
                    temp1 = temp1->next;
                    temp2 = temp2->next;
                }

                return temp1;
            }
        }

        return nullptr;
    }
};
