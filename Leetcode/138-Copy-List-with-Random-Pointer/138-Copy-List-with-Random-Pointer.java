/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return head;
        }

        HashMap<Node, Node> linkMap = new HashMap<Node, Node>();
        Node newHead = new Node(head.val), temp1 = head.next, temp2 = newHead;

        linkMap.put(head, newHead);
        
        while (temp1 != null) {
            temp2.next = new Node(temp1.val);
            linkMap.put(temp1, temp2.next);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        temp1 = head; temp2 = newHead;

        while (temp1 != null) {
            temp2.random = linkMap.get(temp1.random);
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return newHead;
    }
}