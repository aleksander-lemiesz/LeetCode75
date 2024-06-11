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
class DelMidNode {
    public ListNode deleteMiddle(ListNode head) {
        var slow = head;
        if (slow.next == null) {
            return null;
        }
        var fast = head.next.next;
        if (fast != null) {
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
        }
        slow.next = slow.next.next;
        return head;
    }
}