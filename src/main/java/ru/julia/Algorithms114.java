package ru.julia;

import java.util.List;

/**
 * 114. Массив состоит из 0, 1 и 2. Отсортировать по возрастанию.
 */
public class Algorithms114 {
    public static void main(String[] args) {
        Integer[] array = {0, 0, 2, 1, 0, 0, 2, 1, 0, 1, 0, 1};
        bubbleSort(array);
    }
    public static void bubbleSort(Integer[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            int count = 0;
            for (int i = 0; i < array.length - 1 - j; i++) {
                int current = array[i];
                int next = array[i + 1];
                if (current > next) {
                    array[i + 1] = current;
                    array[i] = next;
                    count = count + 1;
                }
            }
            if(count == 0) {
                break;
            }
        }
        printMassive(array);
    }
    public static void printMassive(Integer[] massive) {
        for (int i = 0; i < massive.length; i++) {
            System.out.print(massive[i] + " ");
        }
        System.out.println();
    }
}
