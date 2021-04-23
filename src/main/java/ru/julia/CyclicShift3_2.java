package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * Переместить все элементы массива вправо на n позиций, пр. а1,а2,а3,а4,а5 на 2 позиции а4,а5,а1,а2,а3
 * с использованием вспомогательного массива
 * с использованием вспомогательной переменной
 * с использованием инвертирования массива
 */
public class CyclicShift3_2 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
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
        int shift = 4;
        shiftWithMassive(numbers,shift);
        shiftWithVariable(numbers,shift);
        shiftWithInverting(numbers,shift);

        }
    public static void shiftWithMassive(List<Integer> numbers, int shift) {
        List<Integer> current = new ArrayList<>();
        for (int i = shift; i < numbers.size(); i++) {
            current.add(numbers.get(i));
        }
        for (int i = 0; i < shift; i++) {
            numbers.set(numbers.size()-1-i,numbers.get(shift-1-i));
        }
        for (int i = 0; i < current.size(); i++) {
            numbers.set(i, current.get(i));
        }
        System.out.println("С использованием массива " + numbers);
    }
    public static void shiftWithVariable(List<Integer> numbers, int shift) {
        int current;
        for (int i = 0; i < numbers.size() - shift; i++) {
            current = numbers.get(numbers.size() - 1);
//            System.out.println(current);
            for (int j = 0; j < numbers.size() - 1; j++) {
                numbers.set(numbers.size() - 1 - j, numbers.get(numbers.size() - 2 - j));
//                System.out.println(numbers);
            }
            numbers.set(0, current);
        }
        System.out.println("С использованием переменной " + numbers);
    }

    public static void shiftWithInverting(List<Integer> numbers, int shift) {
        if (shift == 0 || shift == numbers.size()) {
        } else {
            invertingPart(numbers, 0, numbers.size() - 1);
            invertingPart(numbers, 0, numbers.size() - shift - 1);
            invertingPart(numbers, numbers.size() - shift, numbers.size() - 1);
        }
        System.out.println("С использованием инвертирования " + numbers);
    }
    public static void invertingPart(List<Integer> numbers, int start, int finish) {
        int a;
        for (int i = 0; i < (finish - start) / 2 + 1; i++) {
            a = numbers.get(i + start);
            numbers.set(i + start, numbers.get(finish - i));
            numbers.set((finish - i), a);
        }
    }
}
