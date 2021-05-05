package ru.julia;

/**
 * 123. В последовательности выбрать возрастающую подпоследовательность наибольшей длины
 */
public class Algorithms123 {
    public static void main(String[] args) {
        Integer[] array = {0, 0, 5, 1, 2, 3, 4, 1, 1, 1, 1, 1};
        max(array);
    }
    public static void max(Integer[] array) {
        int count = 1;
        int max = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                count = count + 1;
                if (i == array.length - 1) {
                    if (max < count) {
                        max = count;
                    }
                }
            } else {
                if (max < count) {
                    max = count;
                }
                count = 1;
            }
        }
        System.out.println(max);
    }
}
