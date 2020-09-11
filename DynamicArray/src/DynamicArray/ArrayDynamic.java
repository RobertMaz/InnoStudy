package DynamicArray;

import java.util.Arrays;

public class ArrayDynamic {
    private int[] objects;
    private int size;

    public ArrayDynamic() {
        objects = new int[16];
    }

    public void add(int object){
        if (size >= objects.length){
            objects = Arrays.copyOf(objects, size * 2);
        }
        objects[size] = object;
        size++;
    }

    public int[] getAll(){

        return Arrays.copyOf(objects, size );
    }

    public Object get(int index){
        if (index >= size){
            throw new IllegalArgumentException();
        }
        return objects[index];
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        return Arrays.toString(objects);
    }

    public void sort(){
        Arrays.sort(objects);
    }

    public void reverseSort(){
        sort();
        for (int i = 0; i < objects.length / 2; i++) {
            int current = objects[i];
            objects[i] = objects[objects.length - 1 - i];
            objects[objects.length - 1 - i] = current;
        }
    }
}
