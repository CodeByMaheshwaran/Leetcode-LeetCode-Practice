/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        ListNode fastPtr = head;
        ListNode slowPtr = head;
        ListNode prevNode = null;
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        while (fastPtr != null && fastPtr.next != null) {
            prevNode = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        prevNode.next = slowPtr.next;
        return head;
    }
}