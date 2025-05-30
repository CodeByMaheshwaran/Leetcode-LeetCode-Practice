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
      if(head == null || head.next == null){
        return head;
      }
      //cut the list to two halves
      ListNode prev=null, slow=head, fast=head;
      
      while(fast!=null && fast.next!=null){
        prev=slow;
        slow=slow.next;
        fast=fast.next.next;
      }

      prev.next=null;
      // sort the each half

      ListNode l1=sortList(head);
      ListNode l2=sortList(slow);

      //merge l1 and l2
   return merge(l1,l2);   
 }
 ListNode merge(ListNode l1, ListNode l2){
   ListNode dummy=new ListNode(0), res=dummy;
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
   if(l1!=null){
    res.next=l1;
   }
   if(l2!=null){
    res.next=l2;
   }
 return dummy.next;  
 }
}