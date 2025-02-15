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
    public int pairSum(ListNode head) {
    ListNode slowPtr=head,fastPtr=head,first=head;
    int maxSum=0;
    //Middle of LinkedList
    //slowPTr is Middle node when fastPtr points to null
    while(fastPtr!=null && fastPtr.next !=null){
        slowPtr=slowPtr.next;
        fastPtr=fastPtr.next.next;
    }
    //Reverse the LinkedList
    ListNode prevNode=null;
    while(slowPtr!=null)  {
        ListNode nextNode=slowPtr.next;
                 slowPtr.next=prevNode;
                 prevNode=slowPtr;
                 slowPtr=nextNode;
    }
    //Maximum Twin Sum
    while(prevNode!=null){
        maxSum=Math.max(maxSum,(prevNode.val+first.val));
        prevNode=prevNode.next;
        first=first.next;
    }
    return maxSum;
    }
}