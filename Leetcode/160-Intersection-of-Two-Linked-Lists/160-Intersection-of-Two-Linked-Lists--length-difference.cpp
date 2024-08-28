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

        ListNode *tempA = headA, *tempB = headB;
        int lenA = 0, lenB = 0;

        while (tempA != nullptr) {
            tempA = tempA->next;
            lenA++;
        }

        while (tempB != nullptr) {
            tempB = tempB->next;
            lenB++;
        }

        tempA = headA, tempB = headB;
        int diffLength = lenA - lenB;

        if (diffLength > 0) {
            for (int i = 0; i < diffLength; i++) {
                tempA = tempA->next; 
            }
        } else if (diffLength < 0) {
            for (int i = 0; i < -diffLength; i++) {
                tempB = tempB->next; 
            }
        }

        while (tempA != nullptr) {
            if (tempA == tempB) {
                return tempA;
            }

            tempA = tempA->next;
            tempB = tempB->next;
        }

        return nullptr;
    }
};
