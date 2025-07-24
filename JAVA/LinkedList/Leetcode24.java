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
        if(head == null || head.next == null ) return head;
        
        ListNode temp = head;

        while(temp != null && temp.next != null){
            int currVal = temp.val;
            int nextVal = temp.next.val;

            temp.val = nextVal;
            temp.next.val = currVal;

            temp =  temp.next.next;
        }
       return head;
    }
}