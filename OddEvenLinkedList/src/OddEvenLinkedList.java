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

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        var oddList = head;
        var evenList = head.next;
        var second = head.next;

        while(oddList.next != null && evenList.next != null) {
            oddList.next = evenList.next;
            oddList = oddList.next;

            evenList.next = oddList.next;
            evenList = evenList.next;
        }
        oddList.next = second;

        return head;
    }
}
