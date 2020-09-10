package linkedList;

public class Node {
    private Object data;

    public Object getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }
}
