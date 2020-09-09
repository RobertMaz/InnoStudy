public class ClassList {
    Obj hand;
    Obj last;
    public int size = 0;

    ClassList() {
        hand = null;
        last = null;
    }

    public void addFirst(Object data) {
        Obj obj = new Obj(data);
        if (isEmpty())
            last = obj;
        obj.next = hand;
        hand = obj;
        size++;
    }

    public void addLast(Object data) {
        Obj obj = new Obj(data);
        if (isEmpty()) {
            hand = obj;
        } else {
            last.next = obj;
            last = obj;
        }
        size++;
    }

    public boolean isEmpty() {

        return hand == null;
    }

    public int getSome(Object obj) {
        int index = 0;
        while (hand.data != obj) {
            hand = hand.next;
            index++;
        }
        return index;
    }

    public Obj getSomeIndex(int index) {
        int ind = 0;
        while (ind != index) {
            hand = hand.next;
            ind++;
        }
        return hand;
    }

    public Obj removeIndex(int index) {
        Obj current = hand;
        Obj previous = hand;

        int ind = 0;
        while (ind != index) {
            ind++;
            if (current.next == null) {
                return null;
            } else {
                previous = current;
                current = current.next;
            }
        }
        if (current == hand) {
            hand = hand.next;
        } else
            previous.next = current.next;

        return current;
    }

    public Obj removeFirst() {
        Obj obj = hand;
        hand = hand.next;
        return obj;
    }

    public void printAll() {
        Obj current = hand;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
