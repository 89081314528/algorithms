package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 3.1 Инвертирование массива с использованием одной вспомогательной переменной
 */
public class InvertingList3_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(0);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        System.out.println(numbers);
//        inverting(numbers);
        invertingPart(numbers, 7, 9);
    }

    public static void inverting(List<Integer> numbers) {
        int a;
        for (int i = 0; i < numbers.size() / 2; i++) {
            a = numbers.get(i);
            numbers.set(i, numbers.get(numbers.size() - 1 - i));
            numbers.set((numbers.size() - 1 - i), a);
        }
        System.out.println(numbers);
    }

    public static void invertingPart(List<Integer> numbers, int start, int finish) {
        int a;
        for (int i = 0; i < (finish - start) / 2 + 1; i++) {
            a = numbers.get(i + start);
            numbers.set(i + start, numbers.get(finish - i));
            numbers.set((finish - i), a);
        }
        System.out.println(numbers);
    }
}
