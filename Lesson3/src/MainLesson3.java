import java.util.Arrays;

public class MainLesson3 implements Extractable {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new MainLesson3().extract(99)));
    }

    /**
     * Метод возвращает все простые числа до заданного
     *
     * @param number максимальное число от 2
     * @return возвращает все простые числа
     */
    @Override
    public int[] extract(int number) {
        if (number < 2) throw new IllegalArgumentException();
        int[] array = new int[10];
        int countArray = 0;

        for (int i = 2; i < number; i++) {
            boolean isNotFind = true;

            for (int j = 2; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    isNotFind = false;
                    break;
                }
            }

            if (isNotFind) {
                if (countArray >= array.length) {
                    array = Arrays.copyOf(array, countArray * 2);
                }
                array[countArray++] = i;
            }
        }
        int[] newArray = new int[countArray];
        if (countArray >= 0) {
            System.arraycopy(array, 0, newArray, 0, countArray);
        }
        return newArray;
    }
}
