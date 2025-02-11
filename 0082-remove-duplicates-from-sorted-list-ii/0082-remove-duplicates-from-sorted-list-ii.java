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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevNode=dummy;
        ListNode currNode=head;

        while(currNode!=null){
         //if the CurrNode is Duplicate   
         if(currNode.next!=null && currNode.val==currNode.next.val){
           //Move to the Last Duplicated Node 
            while(currNode.next!=null && currNode.val==currNode.next.val){
                currNode=currNode.next;
            }
            //Skip the Duplicated Node
            prevNode.next=currNode.next;
         }else{
            //if We found Unique Node
            prevNode=prevNode.next;
         }
         //Move to the Next Node
         currNode=currNode.next;
        }
     return dummy.next;
    }
}