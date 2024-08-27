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
        unordered_set<ListNode *> memo;
        ListNode *temp = head;

        while (temp != nullptr) {
            if (memo.find(temp) != memo.end()) {
                return true;
            } else {
                memo.insert(temp);
                temp = temp->next;
            }
        }

        return false;
    }
};
