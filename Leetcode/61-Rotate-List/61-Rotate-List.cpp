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
    ListNode* rotateRight(ListNode* head, int k) {
        if (head == nullptr || head->next == nullptr) {
            return head;
        }
        
        int length = 1;
        ListNode *temp = head;

        while (temp->next != nullptr) {
            temp = temp->next;
            length++;
        }

        temp->next = head;
        temp = head;

        int counter = length - (k % length);
        for (int i = 1; i < counter; i++) {
            temp = temp->next;
        }

        head = temp->next;
        temp->next = nullptr;
        return head;
    }
};
