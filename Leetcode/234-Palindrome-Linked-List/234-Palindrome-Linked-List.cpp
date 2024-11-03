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
    bool isPalindrome(ListNode* head) {
        stack<int> reversedList;

        ListNode *temp = head;

        while (temp != NULL) {
            reversedList.push(temp->val);
            temp = temp->next;
        }

        temp = head;

        while (temp != NULL) {
            int current = reversedList.top();
            
            if (temp->val != current) {
                return false;
            }

            temp = temp->next;
            reversedList.pop();
        }

        return true;
    }
};
