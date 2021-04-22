package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 2.2.1 Найти сумму орицательных целых чисел в последовательности
 */
public class SumOfNegatives2_2_1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int sumOfNegatives = 0;
        for (int i = 0; i < 10; i++) {
            int number = (int)(Math.random() * 200 - 100);
            numbers.add(number);
            if (number < 0) {
                sumOfNegatives = sumOfNegatives + number;
            }
        }
        System.out.println(numbers);
        System.out.println(sumOfNegatives);
    }
}
