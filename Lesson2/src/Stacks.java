public class Stacks {

    public int size;
    public Object[] objects;
    public int top;

    public Stacks(int size) {
        this.size = size;
        objects = new Object[size];
        top = -1;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public void add(char[] obj){
        for(Object o : obj){
            objects[++top] = o;
        }
    }
    public int size(){
        return top + 1;
    }

    public Object pop(){
        return objects[top--];
    }

}
