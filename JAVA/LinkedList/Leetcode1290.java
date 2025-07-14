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
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        int len = 0;
        int index = 0;
        
        ListNode temp = head;

        while(temp!= null){
            len++;
            temp = temp.next;
        }

        temp = head;
        
        while(temp!= null){
            if(temp.val == 1) ans += Math.pow(2, len - index - 1);
            temp = temp.next;
            index++;
        }
        return ans;
    }
}