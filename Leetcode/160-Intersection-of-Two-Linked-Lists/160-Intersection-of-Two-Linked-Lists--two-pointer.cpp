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

        int flag1 = 1, flag2 = 1;
        ListNode *tempA = headA, *tempB = headB;
        
        while (tempA != nullptr || tempB != nullptr) {
            if (tempA == tempB) {
                return tempA;
            }

            tempA = tempA->next, tempB = tempB->next;

            if (tempA == nullptr) {
                if (flag1) {
                    tempA = headB;
                    flag1 = 0;
                } else {
                    return nullptr;
                }
            }

            if (tempB == nullptr) {
                if (flag2) {
                    tempB = headA;
                    flag2 = 0;
                } else {
                    return nullptr;
                }
            }
        }

        return nullptr;
    }
};
