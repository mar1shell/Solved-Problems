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
    ListNode* reverse(ListNode* head) {
        ListNode *prev = nullptr, *next = nullptr, *current = head;

        while (current != nullptr) {
            next = current->next;
            current->next = prev;
            prev = current;
            current = next;
        }
        
        return prev;
    }
public:
    bool isPalindrome(ListNode* head) {
        if (head == nullptr || head->next == nullptr) {
            // if head is null or list has only one node then it's a palindrome
            return true; 
        }

        ListNode *slow = head, *fast = head;

        while (fast != nullptr && fast->next != nullptr) { 
            // we use fast and slow to detect middle of the list
            slow = slow->next;
            fast = fast->next->next;
        }

        // we reverse the second half of the list
        ListNode *secondHalf = reverse(slow), *firstHalf = head;
        ListNode *secondHalfHead = secondHalf; 
        // we store the head of the second list to reverse afterwards and return to the original list

        while (secondHalf != nullptr) { // we compare the first half with the seocnd half
            if (firstHalf->val != secondHalf->val) {
                return false;
            }

            firstHalf = firstHalf->next;
            secondHalf = secondHalf->next;
        }

        reverse(secondHalfHead); // we reverse the second half

        return true;
    }
};
