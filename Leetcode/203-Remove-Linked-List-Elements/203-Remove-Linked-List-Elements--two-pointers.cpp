class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        while (head != nullptr && head->val == val) {
            head = head->next;
        }

        ListNode *temp1 = head, *temp2 = head;
        
        while (temp2 != nullptr) {
            if (temp2->val == val) {
                while (temp2 != nullptr && temp2->val == val) {
                    temp2 = temp2->next;
                }

                temp1->next = temp2;
            }

            temp1 = temp2;
            temp2 = (temp2 != nullptr) ? temp2->next : nullptr;
        }

        return head;
    }
};
