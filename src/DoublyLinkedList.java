public class DoublyLinkedList <T>{
   //Node inner class for DLL
    public class Node{
        public  T data;
        public Node nextNode;
        public Node prevNode;
   }
   public Node headNode;
   public int size;

    public DoublyLinkedList() {
        this.headNode=null;
    }
    //checks if the list is empty
    public boolean isEmpty(){
        if(headNode==null)
            return true; //means headNode is empty
        return false; //is not empty
    }
    public void insertAtHead(T data){
        //create node and put in the data
        Node node = new Node();
        node.data=data;
        // Makes next of new node as head and previous as NULL
        node.nextNode=this.headNode;
        node.prevNode=null;
        //Change previous of head node to new Node
        if(headNode!=null)
            headNode.prevNode=node;
        this.headNode=node;
        size++;
    }
    public void printList(){
        if(isEmpty()) {
            System.out.println(" List is empty ");
            return;
        }
        Node temp=headNode;
        System.out.println("List : null <-");
        while (temp.nextNode!=null){
            System.out.println(temp.data.toString() + "<-> ");
            temp=temp.nextNode;
        }
        System.out.println(temp.data.toString()+ " -> null ");
    }

}
