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
    ListNode* mergeTwoLists(ListNode* list1, ListNode* list2) {
        if (list1 == nullptr && list2 == nullptr) {
            return nullptr;
        } else if (list1 == nullptr) {
            return list2;
        } else if (list2 == nullptr) {
            return list1;
        }

        ListNode *head = new ListNode;
        
        if (list1->val <= list2->val) {
            head->val = list1->val;
            list1 = list1->next;
        } else {
            head->val = list2->val;
            list2 = list2->next;
        }
        
        ListNode *temp = head, *temp1 = list1, *temp2 = list2;

        while (temp1 != nullptr && temp2 != nullptr) {
            if (temp1->val < temp2->val) {
                temp->next = new ListNode(temp1->val);
                temp = temp->next;
                temp1 = temp1->next;
            } else {
                temp->next = new ListNode(temp2->val);
                temp = temp->next;
                temp2 = temp2->next;
            }
        }

        while (temp1 != nullptr) {
            temp->next = new ListNode(temp1->val);
            temp = temp->next;
            temp1 = temp1->next;
        }

        while (temp2 != nullptr) {
            temp->next = new ListNode(temp2->val);
            temp = temp->next;
            temp2 = temp2->next;
        }

        return head;
    }
};
