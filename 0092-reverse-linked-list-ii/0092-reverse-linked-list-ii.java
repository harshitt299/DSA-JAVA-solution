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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || left==right){
            return head;
        }
           ListNode first = head;
           ListNode prev = null;

        for(int i=1; i<left;i++){
           prev = first;
           first = first.next;
        }
        ListNode next;
        ListNode curr = first;
        ListNode prev1 = null;
           for(int i=left; i<=right; i++){
            next = curr.next;
            curr.next = prev1;
            prev1 = curr;
            curr = next;
        }
        if(prev!=null){
        prev.next = prev1;
        }else{
            head=prev1;
        }
        first.next = curr;
        return head;
    }


}