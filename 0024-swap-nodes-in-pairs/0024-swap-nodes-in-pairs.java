class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1); 
        dummy.next = head;
        ListNode prev = dummy; 

        while (head != null && head.next != null) { 
            ListNode first = head;         
            ListNode second = head.next;   
            ListNode temp = second.next;   


            second.next = first;
            first.next = temp;
            prev.next = second; 

            prev = first;
            head = temp; 
        }

        return dummy.next; 
    }
}
