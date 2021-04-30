package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 10. Найти все натуральные числа, не превосходящие N и делящиеся на каждую из своих цифр
 */
public class Algorithms10 {
    public static void main(String[] args) {
        for (int i = 1; i < 1000; i++) {
            if(isDevidedByNumerals(i)) {
                System.out.println(i);
            }
        }
    }
    public static boolean isDevidedByNumerals(int number) {
        int currentNumber = number;
            List<Integer> numeralsOfNumbers = new ArrayList<>();
            currentNumber = Math.abs(currentNumber);
            while (currentNumber > 0) {
                int remainder = currentNumber % 10;
                currentNumber = currentNumber / 10;
                numeralsOfNumbers.add(remainder);
            }
        for (int i = 0; i < numeralsOfNumbers.size(); i++) {
            if (numeralsOfNumbers.get(i) == 0) {
                return false;
            }
            if (number % numeralsOfNumbers.get(i) != 0) {
                return false;
            }
        }
        return true;
    }
}
