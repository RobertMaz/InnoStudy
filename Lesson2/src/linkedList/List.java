package linkedList;

import java.util.Objects;

public class List {
    private Node head;
    private int size;

    public List() {
        head = null;
    }

    public int size() {
        return size;
    }


    public void add(Object data, int index) {
        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.getNext();
        }
        node.setNext(new Node(data, node.getNext()));
    }

    public void remove(int index) {
        Node node = head;
        if (index > size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = 1; i < index; i++) {
            node = node.getNext();
        }
        node.setNext(node.getNext().getNext());

    }

    public boolean contains(Object data) {
        Node node = head;
        while (node != null) {
            if (node.getData() == data) {
                return true;
            }
            node = node.getNext();
        }
        return false;
    }

    public Node get(int index) {
        Node node = head;
        if (index == 0) {
            return node;
        }
        for (int i = 1; i < index; i++) {
            node = node.getNext();
        }
        return node.getNext();
    }


    public void addFirst(Object data) {
        size++;
        Node newNode = new Node(data, head);
        newNode.setNext(head);
        head = newNode;
    }

    public void addLast(Object data) {
        size++;
        if (head == null) {
            head = new Node(data, null);
            return;
        }

        Node node = head;
        while (node.getNext() != null) {
            node = node.getNext();
        }
        node.setNext(new Node(data, null));
    }

    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        List list = (List) o;
        if (size != list.size) {
            return false;
        }
        Node node = head;
        Node node2 = list.head;
        while (node != null) {
            if (node.getData() != node2.getData()) {
                return false;
            }
            node = node.getNext();
            node2 = node2.getNext();
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hashcode = 1;
        Node node = head;
        while(node != null){
            hashcode *= Objects.hashCode(node);
            node = node.getNext();
        }
        return hashcode;
    }
}
