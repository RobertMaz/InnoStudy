package linkedList;

public class Main {
    public static void main(String[] args) {
        List list = new List();
        list.addLast(12);
        list.addLast(23);
        list.addLast(34);
        list.addLast(45);
        list.addLast(56);
        list.addFirst(8);
        list.addFirst(7);
        list.addFirst(6);
        list.addFirst(5);
        list.addFirst(4);
        list.addFirst(3);
        list.addFirst(2);
        list.addFirst(1);
        list.add(9, 8);
        list.add(10, 9);
        list.remove(9);
        list.printAll();
    }
}
