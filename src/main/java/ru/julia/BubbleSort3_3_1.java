package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3.1 Пузырьковая сортировка
 */
public class BubbleSort3_3_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
        System.out.println(numbers);
        bubbleSort(numbers);
    }
    public static void bubbleSort(List<Integer> numbers) {
        for (int j = 0; j < numbers.size() - 1; j++) {
            int count = 0;
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int current = numbers.get(i);
                int next = numbers.get(i + 1);
                if (current > next) {
                    numbers.set(i + 1, current);
                    numbers.set(i, next);
                    count = count + 1;
                }
            }
//            System.out.println(j);
//            System.out.println(count);
//            System.out.println(numbers);
            if(count == 0) {
                break;
            }
        }
        System.out.println(numbers);
    }
}
