/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = head, tail = head;
        int length = 0;

        while (temp != null) {
            if (temp.next == null) {
                tail = temp;
            }

            temp = temp.next;
            length++;
        }

        k = k % length;

        System.out.println(length + " " + k);

        if (k == 0) {
            return head;
        }

        ListNode newTail = head;

        for (int i = 0; i < length - k - 1; i++) {
            newTail = newTail.next;
        }

        ListNode newHead = newTail.next;
        newTail.next = null;
        tail.next = head;

        return newHead;
    }
}