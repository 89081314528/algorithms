package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 1.2 Определить цифры заданного числа, их количество и сумму
 */
public class NumeralsOfNumber1_2 {
    public static void main(String[] args) {
        int number = -1010;
        numeralsOfNumber(number);
    }

    public static void numeralsOfNumber(int number) {
        number = Math.abs(number);
        if (number == 0) {
            System.out.println(number);
            System.out.println("Количество цифр = " + 1);
            System.out.println("Сумма цифр = " + 0);
        } else {
            List<Integer> listOfNumbers = new ArrayList<>();
            while (number > 0) {
                int remainder = number % 10;
                number = number / 10;
                listOfNumbers.add(remainder);
            }
            System.out.println(listOfNumbers);
            System.out.println("Количество цифр = " + listOfNumbers.size());
            int sum = 0;
            for (int i = 0; i < listOfNumbers.size(); i++) {
                sum = sum + listOfNumbers.get(i);
            }
            System.out.println("Сумма цифр = " + sum);
        }
    }
}
