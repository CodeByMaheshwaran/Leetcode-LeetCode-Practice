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
    public ListNode oddEvenList(ListNode head) {
    if(head==null){
        return head;
    }
    ListNode odd=head;
    ListNode even=head.next;

    //Maintain the even Head
    ListNode evenHead=even;
    while(even!=null && even.next!=null){
     //Change the pointers for Odd List
     odd.next=odd.next.next;
     odd=odd.next;
  
     //Change the pointers for even List
     even.next=even.next.next;
     even=even.next;
    
    }
     //Assign the even List at the end of Odd List
     odd.next=evenHead;
    
    return head;
    }
}