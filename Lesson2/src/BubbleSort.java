import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {3,65,1,4,1,3,6};
        System.out.println(Arrays.toString(insertSort(arr)));


    }

    public static int[] insertSort(int[] current){
        int[] array = current.clone();
        int index = 0;
        //int param = 0;

        for (int i = 0; i < array.length; i++) {

            int min = array[i];
            boolean flag  = false;

            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]){
                    min = array[j];
                    index = j;
                    flag = true;
                }
            }

            if (flag) {
                int param = array[i];
                array[i] = min;
                array[index] = param;
            }
        }
        return array;
    }

    public static int[]  bubbleSort(int[] current){
        int[] array = current.clone();
        int size = array.length;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int one = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = one;
                }
            }
            size -= 1;
        }
        return array;
    }
}
