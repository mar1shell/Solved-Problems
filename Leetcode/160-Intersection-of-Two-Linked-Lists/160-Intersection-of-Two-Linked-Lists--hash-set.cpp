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
        unordered_set<ListNode *> memo;

        while (tempA != nullptr || tempB != nullptr) {
            if (tempA != nullptr) {
                if (memo.find(tempA) != memo.end()) {
                    return tempA;
                } else {
                    memo.insert(tempA);
                    tempA = tempA->next;
                }
            }

            if (tempB != nullptr) {
                if (memo.find(tempB) != memo.end()) {
                    return tempB;
                } else {
                    memo.insert(tempB);
                    tempB = tempB->next;
                }
            }
        }
        
        return nullptr;
    }
};
