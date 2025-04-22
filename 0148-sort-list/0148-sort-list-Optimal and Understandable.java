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
    public ListNode sortList(ListNode head) {
      //Base Case
      if(head==null || head.next==null) return head;
      //Split in the Middle
      ListNode l1=head, l2=splitMidNode(head);     
      //sort the left list
      l1=sortList(l1);
      //sort the right list
      l2=sortList(l2);
      //Merge list together
      ListNode dummy = new ListNode(), res=dummy;
      while(l1!=null && l2!=null){
        if(l1.val < l2.val){
            res.next=l1;
            l1=l1.next;
        }else{
            res.next=l2;
            l2=l2.next;
        }
        res=res.next;
      }
      if(l2!=null){
        res.next=l2;
      }else{
        res.next=l1;
      }
    //return the head node;  
    return dummy.next;  
    }
   private ListNode splitMidNode(ListNode head){
    ListNode slow=head,fast=head, pre=null;
    while(fast!=null && fast.next!=null){
        pre=slow;
        slow=slow.next;
        fast=fast.next.next;
    }
    pre.next=null;
    return slow;
   }
}