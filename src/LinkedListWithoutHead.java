public class LinkedListWithoutHead {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            next = null;
        }
    }
    void printList(Node node){

        while(node!=null){
            System.out.println(node.data + " ");
            node= node.next;
        }
    }
    void deleteNode(Node node){
        Node temp= node.next;
        node.data = temp.data;
        node.next= temp.next;
        System.gc();
    }

    public static void main(String[] args) {
        LinkedListWithoutHead linkedListWithoutHead = new LinkedListWithoutHead();
        linkedListWithoutHead.head = new Node(1);
        linkedListWithoutHead.head.next = new Node(2);
        Node node = linkedListWithoutHead.head.next.next= new Node(3);
        linkedListWithoutHead.head.next.next.next = new Node(4);
        linkedListWithoutHead.head.next.next.next.next = new Node(5);
        System.out.println("Before Deletion ");
        linkedListWithoutHead.printList(head);

        linkedListWithoutHead.deleteNode(node);
        System.out.println(" ");
        System.out.println( " after deletion ");
        linkedListWithoutHead.printList(head);

    }
}
