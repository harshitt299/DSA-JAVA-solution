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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
         
        ListNode temp=head;
        ListNode tail = null;
        int size = 1;
        while(temp.next!=null){
            size++;
          temp = temp.next;
        }
        int K = k%size;
            if (K==0){
                return head;
            }
            temp.next = head;
            temp = head;
           
            for(int i=1; i<size-K; i++){
                temp = temp.next;
            }
            ListNode  newHead = temp.next;
             temp.next = null;
            return newHead;
        }

}