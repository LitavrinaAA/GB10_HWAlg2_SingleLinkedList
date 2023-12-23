public class SingleLinkedList {
    Node head;
    Node tail;
    public void revers() {
        if ( head != null && head.next != null) {
            Node temp = head;
            revers(head.next, head);
            temp.next = null;
        }
    }
    private void revers(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revers(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }
    public void add(int value) {
       Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
    }
    public static class Node {

        int value;
        Node next;
//        Node previous;
    }
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        Node currentNode = head;
        while (currentNode  != null) {
            str.append(currentNode.value).append(" ");
            currentNode = currentNode.next;
        }

        return str.toString();
    }
}
