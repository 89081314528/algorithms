package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.3.2 Cортировка выбором - находим минимальный и меняем местами с первым, затем находим минимальный
 * из оставшихся и меняем со вторым и т. д.
 */
public class SelectionSort3_3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 100 - 0);
            numbers.add(number);
        }
        System.out.println(numbers);
        selectionSort(numbers);
    }

    public static void selectionSort(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            int current = numbers.get(i);
            int min = numbers.get(i);
            int minIndex = i;
            for (int j = 1 + i; j < numbers.size(); j++) {
                if (numbers.get(j) < min) {
                    min = numbers.get(j);
                    minIndex = j;
                }
            }
            numbers.set(i, min);
            numbers.set(minIndex, current);
        }
        System.out.println(numbers);
    }

}
