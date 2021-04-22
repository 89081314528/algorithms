package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.2.3 Определить, сколько раз последовательность ненулевых числе меняет знак
 */
public class NumberOfChanges2_2_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int number = (int) (Math.random() * 200 - 100);
            numbers.add(number);
        }
        System.out.println(numbers);

        numberOfChanges(numbers);
    }
    // класс и метод можно называть одинаково?
    public static void numberOfChanges(List<Integer> numbers) {
        int count = 0;
        for (int i = 0; i < numbers.size() - 1; i++) {
            int currentNumber = numbers.get(i);
            int nextNumber = numbers.get(i + 1);
            if ((currentNumber * nextNumber) < 0) {
                count = count + 1;
                System.out.println(currentNumber + " * " + nextNumber);
                System.out.println(count);
            }
        }
    }
}
