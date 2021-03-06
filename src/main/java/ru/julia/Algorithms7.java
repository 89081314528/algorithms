package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 7. Найти наименьшее, делящееся на 99 натуральное число, все цифры которого четные
 */
public class Algorithms7 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (isDevided(i) && numeralsIsOdd(i)) {
                System.out.println(i);
                break;
            }
        }
    }

    public static boolean isDevided(int number) {
        if (number % 99 == 0) {
            return true;
        }
        return false;
    }

    public static boolean numeralsIsOdd(int number) {
        List<Integer> numeralsOfNumbers = new ArrayList<>();
        number = Math.abs(number);
        int count = 0;
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            numeralsOfNumbers.add(remainder);
            if (remainder % 2 == 0)
                count = count + 1;
        }
        if (count == numeralsOfNumbers.size()) {
            return true;
        }
        return false;
    }
}
