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
class MaxTwinSum {
    public int pairSum(ListNode head) {
        if (head == null) return 0;
        var slow = head;
        var fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        var reversedList = reverseList(slow);
        var start = head;
        int max = Integer.MIN_VALUE;
        while (reversedList != null && start != null) {
            int pairSum = reversedList.val + start.val;
            if (pairSum > max) max = pairSum;
            start = start.next;
            reversedList = reversedList.next;
        }
        return max;
    }

    // Copied from previous solution
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = null;
        var next = head;
        while (next != null) {
            var tmp = next.next;

            next.next = curr;
            curr = next;
            next = tmp;
        }
        return curr;
    }
}