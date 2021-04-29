package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 5. Найти все натуральные четырехзначные числа в записи которых нет одинаковых цифр
 */
public class Algorithms5 {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            if(withoutEqualsNumerals(i)) {
                System.out.print(i + " ");
            }
        }
    }
    public static boolean withoutEqualsNumerals(int number) {
        List<Integer> numerals = numeralsOfNumber(number);
        int count = 0;
        for (int i = 0; i < numerals.size(); i++) {
            int current = numerals.get(i);
            for (int j = i + 1; j < numerals.size(); j++) {
                if (current == numerals.get(j)) {
                    count = count + 1;
                }
            }
        }
        if (count > 0) {
            return false;
        }
        return true;
    }
    public static List<Integer> numeralsOfNumber(int number) {
        List<Integer> numeralsOfNumbers = new ArrayList<>();
        number = Math.abs(number);
        if (number == 0) {
            numeralsOfNumbers.add(number);
        } else {
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                numeralsOfNumbers.add(remainder);
            }
        }
        return numeralsOfNumbers;
    }
}
