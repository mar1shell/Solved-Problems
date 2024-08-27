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
    ListNode *detectCycle(ListNode *head) {
        if (head == nullptr) {
            return nullptr;
        }

        unordered_set<ListNode *> memo;
        ListNode *temp = head;

        while (temp != nullptr) {
            if (memo.find(temp) != memo.end()) {
                return temp;
            } else {
                memo.insert(temp);
                temp = temp->next;
            }
        }

        return nullptr;
    }
};
