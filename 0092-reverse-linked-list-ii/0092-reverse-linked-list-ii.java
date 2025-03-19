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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode prevLeft = dummy;
        
        for (int i = 1; i < left; i++) {
            prevLeft = prevLeft.next;
        }

        ListNode leftPart = prevLeft.next;
        ListNode temp = leftPart;
        ListNode afterRight = temp.next;

        for (int i = left; i < right; i++) {
            temp = temp.next;
            afterRight = temp.next;
        }

        ListNode rightPart = temp;
        rightPart.next = null;  

        ListNode reversed = reverse(leftPart);  

        prevLeft.next = reversed;
        leftPart.next = afterRight;

        return dummy.next;
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}
