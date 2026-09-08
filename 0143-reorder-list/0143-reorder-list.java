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
    public void reorderList(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast =fast.next.next;
        }
        ListNode curr = slow;
        ListNode next;
        ListNode prev =null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode right = prev;
        ListNode left = head;
        while(right!=null&& right.next!=null){
            ListNode tmp1=left.next;
             ListNode tmp2=right.next;
            left.next = right;
            right.next = tmp1;
            left  = tmp1;
            right = tmp2;
        }
    }
}