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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
   ListNode dummy = new ListNode(0);

   dummy.next =head;

   ListNode prev = dummy ;
   ListNode first = head;
   ListNode second = head.next;

   while(second!=null){

    first.next = second.next;
    second.next = first;
    prev.next = second;

    prev = first;
    first = first.next;

    if(first==null){
        break;
    }
    second = first.next;

   }
   return dummy.next;
}
}