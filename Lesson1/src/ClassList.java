public class ClassList {
    Obj hand;
    public int size = 0;

    ClassList() {
        hand = null;
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
        if (current == hand){
            hand = hand.next;
        }
        else
            previous.next = current.next;

        return current;
    }


    public void addFirst(Object data) {
        size++;
        Obj obj = new Obj(data, hand);
        obj.next = hand;
        hand = obj;
    }

    public Obj removeFirst() {
        Obj obj = hand;
        hand = hand.next;
        return obj;
    }

    public void printAll() {
        while (hand != null) {
            System.out.println(hand.data);
            hand = hand.next;
        }
    }
}
