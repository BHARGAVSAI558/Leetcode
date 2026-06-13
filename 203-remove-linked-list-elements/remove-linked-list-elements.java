/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) {
 *         this.val = val;
 *         this.next = next;
 *     }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // Create a dummy node pointing to head
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Start from dummy
        ListNode curr = dummy;

        while (curr.next != null) {
            if (curr.next.val == val) {
                // Skip the node with value = val
                curr.next = curr.next.next;
            } else {
                // Move to next node
                curr = curr.next;
            }
        }

        return dummy.next;
    }
}