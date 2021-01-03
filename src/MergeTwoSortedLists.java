/*Merge two sorted linked lists and return it as a sorted list. The list should be made by splicing together the nodes of the first two lists.



        Example 1:


        Input: l1 = [1,2,4], l2 = [1,3,4]
        Output: [1,1,2,3,4,4]
        Example 2:

        Input: l1 = [], l2 = []
        Output: []
        Example 3:

        Input: l1 = [], l2 = [0]
        Output: [0]


        Constraints:

        The number of nodes in both lists is in the range [0, 50].
        -100 <= Node.val <= 100
        Both l1 and l2 are sorted in non-decreasing order.*/

 class ListNode1 {
    int val;
    ListNode1 next;
    ListNode1() {}
   ListNode1(int val) { this.val = val; }
     ListNode1(int val, ListNode1 next) { this.val = val; this.next = next; }
 }

public class MergeTwoSortedLists {
    public ListNode1 mergeTwoLists(ListNode1 l1, ListNode1 l2) {
        // maintain an unchanging reference to node ahead of the return node.
        ListNode1 prehead = new ListNode1(-1);

        ListNode1 prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // exactly one of l1 and l2 can be non-null at this point, so connect
        // the non-null list to the end of the merged list.
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }
}

