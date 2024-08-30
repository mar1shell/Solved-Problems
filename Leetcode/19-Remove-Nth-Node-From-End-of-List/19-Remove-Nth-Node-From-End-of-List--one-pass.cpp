class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        // If the list contains only one node, return nullptr since we need to remove the only node.
        if (head->next == nullptr) {
            return nullptr;
        }

        // `flag` keeps track of how far we've traversed the list.
        int flag = 0;

        // `temp1` is used to traverse the list.
        ListNode *temp1 = head;

        // `temp2` will lag `n` nodes behind `temp1` and will point to the node just before the node to be removed.
        ListNode *temp2 = nullptr;

        // Traverse the list with `temp1`.
        while (temp1 != nullptr) {
            temp1 = temp1->next;  // Move `temp1` to the next node.
            flag++;  // Increment `flag` with each step.

            // Once `flag` exceeds `n`, start moving `temp2`.
            // This ensures that `temp2` lags `n` nodes behind `temp1`.
            if (flag >= n + 1) {
                temp2 = (temp2 == nullptr) ? head : temp2->next;
            }
        }
        
        // If `temp2` is not `nullptr`, we are not removing the head node.
        if (temp2 != nullptr) {
            // `temp2->next` is the node to be removed, so skip it.
            temp2->next = (temp2->next)->next;
        } else {
            // If `temp2` is still `nullptr`, it means the head node is the one to be removed.
            head = head->next;
        }

        // Return the modified list.
        return head;
    }
};
