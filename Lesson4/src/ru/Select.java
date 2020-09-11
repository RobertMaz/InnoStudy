package ru;

import DynamicArray.ArrayDynamic;

public class Select implements Selectable {


    public int[] program(String data) {
        ArrayDynamic arrayDynamic = new ArrayDynamic();
        int n = Extract.getNumber(data);

        if (n < 0) {
            throw new IllegalArgumentException();
        }

        int[] array = RandomNumber.getRandomNumbers(30, n);

        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                throw new IllegalArgumentException("Number is lower 0");
            }

            double number = Math.sqrt(array[i]);
            int integerNumber = (int) number;

            if (integerNumber * integerNumber == array[i]) {
                System.out.println(array[i]);
            }

            if (number % (integerNumber + 10) > integerNumber) {
                System.out.println(number);
                System.out.println(number % (integerNumber * 10));
                System.out.println(integerNumber);
                arrayDynamic.add(array[i]);
            }
        }
        arrayDynamic.reverseSort();
        return arrayDynamic.getAll();
    }

}
