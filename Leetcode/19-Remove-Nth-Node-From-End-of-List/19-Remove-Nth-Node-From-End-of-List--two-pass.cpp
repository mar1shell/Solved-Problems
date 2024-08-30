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
    int listLength(ListNode *head) {
        int len = 0;
        while (head != nullptr) {
            len++;
            head = head->next;
        }

        return len;
    }
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        int len = listLength(head), position = len - n;
        if (position == 0) {
            head = head->next;
            return head;
        }
        
        ListNode *temp = head;

        for (int i = 0; i < position - 1; i++) {
            temp = temp->next;
        }

        temp->next = (temp->next)->next;
        return head;
    }
};
