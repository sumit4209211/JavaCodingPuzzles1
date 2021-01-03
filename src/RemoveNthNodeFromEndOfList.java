/*Remove Nth Node From End of List
        Medium

        4449

        270

        Add to List

        Share
        Given the head of a linked list, remove the nth node from the end of the list and return its head.

        Follow up: Could you do this in one pass?



        Example 1:


        Input: head = [1,2,3,4,5], n = 2
        Output: [1,2,3,5]
        Example 2:

        Input: head = [1], n = 1
        Output: []
        Example 3:

        Input: head = [1,2], n = 1
        Output: [1]


        Constraints:

        The number of nodes in the list is sz.
        1 <= sz <= 30
        0 <= Node.val <= 100
        1 <= n <= sz*/


  class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
   ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }
}
