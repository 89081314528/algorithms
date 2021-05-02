package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 18. Число n. Если оно не палиндром, изменим порядок цифр на обратный и сложим исходное число с получившимся.
 * Повторяем, пока не получится полиндром.
 */
public class Algorithms18 {
    public static void main(String[] args) {
     int a = 15278;
        System.out.println("a = " + a);
        while (!isPalindrom(a)) {
                a = a + reverseNumber(a);
                System.out.println("Новое число " + a);
        }
        System.out.println("число является палиндромом " + a);
    }
    public static boolean isPalindrom(int number) {
        String str = Integer. toString(number);
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) == str.charAt(str.length() - 1 - i)) {
            } else {
                return false;
            }
        }
        return true;
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
}
