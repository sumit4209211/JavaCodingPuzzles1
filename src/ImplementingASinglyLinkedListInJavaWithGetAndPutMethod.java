// Java program to implement 
// a Singly Linked List 
 class LinkedList {

    Node head; // head of list 

    // Linked list Node. 
    // This inner class is made static 
    // so that main() can access it 
    static class Node {

        int data;
        Node next;

        // Constructor 
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    // Method to add a new node 
    public static LinkedList add(LinkedList list, int data)
    {
        // Create a new node with given data 
        Node new_node = new Node(data);
        new_node.next = null;

        // If the Linked List is empty, 
        // then make the new node as head 
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            // Else traverse till the last node 
            // and add the new_node there 
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }

            // add the new_node at last node 
            last.next = new_node;
        }

        // Return the list by head 
        return list;
    }

    // Method to print the LinkedList. 
    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        // Traverse through the LinkedList 
        while (currNode != null) {
            // Print the data at current node 
            System.out.print(currNode.data + " ");

            // Go to next node 
            currNode = currNode.next;
        }
    }

    // Driver code 
    public static void main(String[] args)
    {
        /* Start with the empty list. */
        LinkedList list = new LinkedList();

        // 
        // ******addION****** 
        // 

        // add the values 
        list = add(list, 1);
        list = add(list, 2);
        list = add(list, 3);
        list = add(list, 4);
        list = add(list, 5);
        list = add(list, 6);
        list = add(list, 7);
        list = add(list, 8);

        // Print the LinkedList 
        printList(list);
    }
}
