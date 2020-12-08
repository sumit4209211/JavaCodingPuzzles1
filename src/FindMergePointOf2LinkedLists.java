import java.util.*;
class LinkedList1{
    static Node head1,head2;
    static class Node{
        int data;
        Node next;
        Node(int d)
        {
            data =d;
            next=null;
        }
    }

    // Function to get the intersection point
    int getNode()
    {
        int c1=getCount(head1);
        int c2=getCount(head2);
        int d;
        if(c1>c2){
            d=c1-c2;
            return _getIntersectionNode(d,head1,head2);
        }
        else{
            d=c2-c1;
            return _getIntersectionNode(d,head2,head1);

        }
    }
    //function to get intersection point of two linked lists head1 and head2 where head1 has d more nodes heads
    int _getIntersectionNode(int d,Node node1,Node node2)
    {
        int i;
        Node currentNode1=node1;
        Node curreNode2=node2;
        for(i=0;i<d;i++){
            if(currentNode1==null){
                return -1;
            }
            currentNode1=currentNode1.next;
            curreNode2=curreNode2.next;
        }
        return -1;
    }
    //Takes head pointer of Linkedlist and returns the count of nodes in the list
    int getCount(Node node)
    {
        Node current=node;
        int count=0;
        while(current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public static void main(String[] args) {
        // creating first linked list
        LinkedList1 list= new LinkedList1();
        list.head1 = new Node(3);
        list.head1.next = new Node(6);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(15);
        list.head1.next.next.next.next = new Node(30);

        // creating second linked list
        list.head2 = new Node(10);
        list.head2.next = new Node(15);
        list.head2.next.next = new Node(30);

        System.out.println("The node of intersection is " + list.getNode());
    }
}