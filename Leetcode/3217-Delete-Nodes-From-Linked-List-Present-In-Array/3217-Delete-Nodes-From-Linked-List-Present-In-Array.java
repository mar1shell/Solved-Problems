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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> numSet = new HashSet<>();

        for (int num: nums) {
            numSet.add(num);
        }
 
        ListNode newHead = null, newCurrNode = head, currNode = head;
        boolean initialized = false;
        
        while (currNode != null) {
            if (!numSet.contains(currNode.val)) {
                if (!initialized) {
                    newHead = new ListNode(currNode.val);
                    newCurrNode = newHead;
                    initialized = true;
                } else {
                    newCurrNode.next = new ListNode(currNode.val);
                    newCurrNode = newCurrNode.next;
                }
            }

            currNode = currNode.next;
        }

        return newHead;
    }
}