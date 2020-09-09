package com.inno;

public class List {
    public Node first;
    public Node last;


    public List() {
        first = null;
    }

    public void addFirst(Object obj) {
        Node node = new Node(obj);
        if (isEmpty()) {
            last = node;
        }
        node.next = first;
        first = node;
    }

    public void addLast(Object obj){
        Node node = new Node(obj);
        if (isEmpty()){
            first =node;
        }
        else
            last.next = node;
        last = node;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void remove(Object obj) {
        Node node = first;
        while (node != null) {
            if (obj == node.obj) {
                first = first.next;
            }
            first = first.next;
        }
    }

    public void print() {
        Node node = first;
        while (node != null) {
            System.out.println(node.obj);
            node = node.next;
        }
    }


    public static class Node {
        private Object obj;
        private Node next;


        public Node(Object obj) {
            this.obj = obj;
        }
    }
}
