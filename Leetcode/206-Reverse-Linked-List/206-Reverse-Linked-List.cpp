/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* reverseList(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }

        ListNode *temp1 = nullptr;
        ListNode *temp2 = head;
        ListNode *nextTemp = nullptr;

        while (temp2 != nullptr) {
            nextTemp = temp2->next;
            temp2->next = temp1;
            temp1 = temp2;
            temp2 = nextTemp;
        }

        return temp1;
    }
};
