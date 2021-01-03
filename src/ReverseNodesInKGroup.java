/*Given a linked list, reverse the nodes of a linked list k at a time and return its modified list.

        k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

        Follow up:

        Could you solve the problem in O(1) extra memory space?
        You may not alter the values in the list's nodes, only nodes itself may be changed.


        Example 1:


        Input: head = [1,2,3,4,5], k = 2
        Output: [2,1,4,3,5]
        Example 2:


        Input: head = [1,2,3,4,5], k = 3
        Output: [3,2,1,4,5]
        Example 3:

        Input: head = [1,2,3,4,5], k = 1
        Output: [1,2,3,4,5]
        Example 4:

        Input: head = [1], k = 1
        Output: [1]


        Constraints:

        The number of nodes in the list is in the range sz.
        1 <= sz <= 5000
        0 <= Node.val <= 1000
        1 <= k <= sz*/

public class ReverseNodesInKGroup {


        public ListNode reverseLinkedList(ListNode head, int k) {

            // Reverse k nodes of the given linked list.
            // This function assumes that the list contains
            // atleast k nodes.
            ListNode new_head = null;
            ListNode ptr = head;

            while (k > 0) {

                // Keep track of the next node to process in the
                // original list
                ListNode next_node = ptr.next;

                // Insert the node pointed to by "ptr"
                // at the beginning of the reversed list
                ptr.next = new_head;
                new_head = ptr;

                // Move on to the next node
                ptr = next_node;

                // Decrement the count of nodes to be reversed by 1
                k--;
            }


            // Return the head of the reversed list
            return new_head;

        }

        public ListNode reverseKGroup(ListNode head, int k) {

            ListNode ptr = head;
            ListNode ktail = null;

            // Head of the final, moified linked list
            ListNode new_head = null;

            // Keep going until there are nodes in the list
            while (ptr != null) {

                int count = 0;

                // Start counting nodes from the head
                ptr = head;

                // Find the head of the next k nodes
                while (count < k && ptr != null) {
                    ptr = ptr.next;
                    count += 1;
                }

                // If we counted k nodes, reverse them
                if (count == k) {

                    // Reverse k nodes and get the new head
                    ListNode revHead = this.reverseLinkedList(head, k);

                    // new_head is the head of the final linked list
                    if (new_head == null)
                        new_head = revHead;

                    // ktail is the tail of the previous block of
                    // reversed k nodes
                    if (ktail != null)
                        ktail.next = revHead;

                    ktail = head;
                    head = ptr;
                }
            }

            // attach the final, possibly un-reversed portion
            if (ktail != null)
                ktail.next = head;

            return new_head == null ? head : new_head;
        }
    }

