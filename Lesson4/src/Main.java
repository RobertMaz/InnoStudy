import java.util.Arrays;
import java.util.BitSet;

public class Main implements Calculatable{
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(Arrays.toString(main.program("    N=32")));

    }

    public int[] program(String data){
        String newData = data.substring(data.indexOf("=") + 1).trim();
        int N = Integer.parseInt(newData);
        if (N < 0){
            throw new IllegalArgumentException();
        }
        int[] array = new int[N];
        int[] arrayForWork = new int[16];
        int countForArray = 0;
        for (int i = 0; i < N; i++) {
            array[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < N; i++) {
            if (array[i] < 0){
                throw new IllegalArgumentException("Number is lower 0");
            }
            double number = Math.sqrt(array[i]);
            if ( ((((int)number) * (int)number) == array[i])) {
                System.out.println(i);
            }
            if (number % ((int) number * 10 )> (int)number){
                if (countForArray >= arrayForWork.length){
                    arrayForWork = Arrays.copyOf(arrayForWork, countForArray * 2);
                }
                arrayForWork[countForArray++] = array[i];
            }
        }

        int[] endArray = new int[countForArray];
        if (countForArray >= 0) {
            System.arraycopy(arrayForWork, 0, endArray, 0, countForArray);
        }
        Arrays.sort(endArray);
        for (int i = 0; i < endArray.length / 2; i++) {
            int current = endArray[i];
            endArray[i] = endArray[endArray.length - 1 -i];
            endArray[endArray.length - 1 - i] = current;
        }
        return endArray;
    }
}
