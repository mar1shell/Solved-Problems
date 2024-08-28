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
    ListNode *getIntersectionNode(ListNode *headA, ListNode *headB) {
        if (headA == nullptr || headB == nullptr) {
            return nullptr;
        }

        ListNode *tempA = headA;

        while (tempA != nullptr) {
            ListNode *tempB = headB;
            while (tempB != nullptr) {
                if (tempA == tempB) {
                    return tempA;
                }
                tempB = tempB->next;
            }

            tempA = tempA->next;
        }

        return nullptr;
    }
};
