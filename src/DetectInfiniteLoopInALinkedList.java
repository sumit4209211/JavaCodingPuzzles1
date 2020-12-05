class SinglyLinkedList {

    private Node start;

    public void add(Integer i) {
        Node node = new Node(i);
        if (start == null)
            start = node;
        else {
            Node temp = start;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public Node getStart() {
        return start;
    }

    static class Node {

        Node(Integer i) {
            this.value = i;
        }

        private Integer value;
        private Node next;

        public Integer getValue() {
            return value;
        }

        public void setValue(Integer value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
 class FindLoopsInLinkedList
{
    public static void main(String args[]) {

        FindLoopsInLinkedList finder = new FindLoopsInLinkedList();

        SinglyLinkedList sampleList = new SinglyLinkedList();
        // First Insert randomly ten elements in a linked list
        for (int i = 0; i < 10; i++) {
            sampleList.add(i);
        }

        System.out.println("Loop Existence : " + finder.doesLoopExist(sampleList));
        System.out.println("Loop Existence : " + finder.doesLoopExist(finder.createLoop(sampleList)));
    }

    public boolean doesLoopExist(SinglyLinkedList listToCheck) {
        SinglyLinkedList.Node tortoise = listToCheck.getStart();
        SinglyLinkedList.Node hare = listToCheck.getStart();

        try {
            while (true) {
                tortoise = tortoise.getNext();
                hare = hare.getNext().getNext();
                if (tortoise == hare) {
                    return true;
                }
            }
        } catch (NullPointerException ne) {
            return false;
        }
    }

    private SinglyLinkedList createLoop(SinglyLinkedList sampleList) {
        sampleList.getStart().getNext().getNext().getNext().setNext(sampleList.getStart().getNext());
        return sampleList;
    }
}