package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 8. Найти наименьшее натуральное число, кратное 1995, в записи которого 2 цифры, стоящие
 * через одну, одинаковые
 */
public class Algorithms8 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000000; i++) {
            if (isDevided(i) && numeralsIsEqual(i)) {
                System.out.println(i);
                break;
            }
        }
    }
    public static boolean isDevided(int number) {
        if (number % 1995 == 0) {
            return true;
        }
        return false;
    }

    public static boolean numeralsIsEqual(int number) {
        List<Integer> numeralsOfNumbers = new ArrayList<>();
        number = Math.abs(number);
        while (number > 0) {
            int remainder = number % 10;
            number = number / 10;
            numeralsOfNumbers.add(remainder);
        }
        for (int i = 0; i < numeralsOfNumbers.size() - 2; i++) {
            int current = numeralsOfNumbers.get(i);
            int next = numeralsOfNumbers.get(i + 2);
            if (current == next) {
                return true;
            }
        }
        return false;
    }
}
