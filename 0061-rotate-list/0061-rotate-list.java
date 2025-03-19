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
        if (head == null || head.next == null || k == 0) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode temp = dummy.next;
        ListNode temp1 = dummy.next;
        int count = 1;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        k = k % count;
        if (k == 0) return head;

        for (int i = 0; i < count - k - 1; i++) {
            temp1 = temp1.next;
        }

        temp.next = dummy.next;
        dummy.next = temp1.next;
        temp1.next = null;

        return dummy.next;
    }
}
