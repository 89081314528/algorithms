package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 2. Найти все трехзначные числа, сумма цифр которых равна заданному числу
 */
public class Algorithms2 {
    public static void main(String[] args) {
        int number = 26;
        List<Integer> numbers = new ArrayList<>();
        for (int i = 100; i < 1000; i++) {
            if(sumOfNumerals(i) == number) {
                numbers.add(i);
            }
        }
        System.out.println(numbers);
    }
    public static int sumOfNumerals(int number) {
        int sum = 0;
        if (number == 0) {
        } else {
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                sum = sum + remainder;
            }
        }
        return sum;
    }
}
