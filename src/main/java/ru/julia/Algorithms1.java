package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Найти все числа от 0 до 1000, состоящие только из цифр 0 и 7 и делящиеся на 17
 */
public class Algorithms1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        int numeral1 = 0;
        int numeral2 = 7;
        int divider = 7;
        for (int i = 0; i < 1000; i++) {
            if(dividedBy(divider, i) && consistOfNumerals(numeral1, numeral2, i)) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }

    public static boolean dividedBy(int divider, int number) {
        if (number % divider == 0) {
            return true;
        }
        return false;
    }

    public static boolean consistOfNumerals(int numeral1, int numeral2, int number) {
        List<Integer> listOfNumbers = new ArrayList<>();
        if (number == 0) {
            listOfNumbers.add(0);
        } else {
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                listOfNumbers.add(remainder);
            }
        }
        for (int i = 0; i < listOfNumbers.size(); i++) {
            if (listOfNumbers.get(i) != numeral1 && listOfNumbers.get(i) != numeral2) {
                return false;
            }
        }
        return true;
    }
}
