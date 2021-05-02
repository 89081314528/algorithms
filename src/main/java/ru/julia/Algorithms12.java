package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 12. В интервале от a до b найти все сверхпростые числа. Число сверхпростое, если оно простое
 * и число, полученное из его цифр в обратном порядке, тоже простое
 */
public class Algorithms12 {
    public static void main(String[] args) {
        int number = 12345;
        System.out.println(reverseNumber(number));
        for (int i = 1; i < 1000; i++) {
            if (numberIsPrime(i) && numberIsPrime(reverseNumber(i))) {
                System.out.println(i + " " + reverseNumber(i));
            }
        }
    }

    public static int reverseNumber(int number) {
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
        for (int i = 0; i < numeralsOfNumbers.size(); i++) {
            number = number + numeralsOfNumbers.get(i) * (int) Math.pow(10, numeralsOfNumbers.size() - 1 - i);
        }
        return number;
    }
    public static boolean numberIsPrime(int number) {
        List<Integer> dividersList = new ArrayList<>();
        for (int i = 2; i < number / 2 + 1; i++) { //если число 3 или 5, не заходит в цикл
            if (number % i == 0) {
                dividersList.add(i);
            }
        }
        if (dividersList.size() > 0) {
            return false;
        }
        return true;
    }
}
