/*
Given a linked list, swap every two adjacent nodes and return its head.



        Example 1:


        Input: head = [1,2,3,4]
        Output: [2,1,4,3]
        Example 2:

        Input: head = []
        Output: []
        Example 3:

        Input: head = [1]
        Output: [1]


        Constraints:

        The number of nodes in the list is in the range [0, 100].
        0 <= Node.val <= 100


        Follow up: Can you solve the problem without modifying the values in the list's nodes? (i.e., Only nodes themselves may be changed.)
*/

public class SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {

        // Dummy node acts as the prevNode for the head node
        // of the list and hence stores pointer to the head node.
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode prevNode = dummy;

        while ((head != null) && (head.next != null)) {

            // Nodes to be swapped
            ListNode firstNode = head;
            ListNode secondNode = head.next;

            // Swapping
            prevNode.next = secondNode;
            firstNode.next = secondNode.next;
            secondNode.next = firstNode;

            // Reinitializing the head and prevNode for next swap
            prevNode = firstNode;
            head = firstNode.next; // jump
        }

        // Return the new head node.
        return dummy.next;
    }
}
