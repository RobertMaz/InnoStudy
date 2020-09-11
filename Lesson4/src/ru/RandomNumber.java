package ru;

public class RandomNumber {

    private RandomNumber() {
    }

    public static int[] getRandomNumbers(int maxValue, int length){
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = (int)(Math.random() * maxValue) + 1;
        }
        return array;
    }

}
