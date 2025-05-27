/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode currList = lists[i];
            while (currList != null) {
                pq.add(currList.val);
                currList = currList.next;
            }
        }
        ListNode ansList = new ListNode();
        ListNode tempList = ansList;

        while (!pq.isEmpty()) {
            tempList.next =  new ListNode(pq.poll()); 
            tempList =  tempList.next;
        }

        return ansList.next;
    }
}