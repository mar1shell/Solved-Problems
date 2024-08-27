/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        if (head == nullptr) {
            return false;
        }
        
        int f = 1;
        ListNode *temp1 = head->next, *temp2 = head;

        while (temp1 != nullptr) {
            if (temp1 == temp2) {
                return true;
            }

            if (f) {
                temp1 = temp1->next;
                f = 0;
            } else {
                temp1 = temp1->next;
                temp2 = temp2->next;
                f = 1;
            }
        }

        return false;
    }
};
