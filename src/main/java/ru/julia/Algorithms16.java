package ru.julia;

import java.util.ArrayList;
import java.util.List;

/**
 * 16. Число Армстронга - число из к цифр, где сумма к-х степеней цифр равна самому числу. 153 = 1 в 3 степени +
 * 5 в третьей степени + 3 в третьей степени
 */
public class Algorithms16 {
    public static void main(String[] args) {
        for (int i = 10; i < 999; i++) {
            List<Integer> numeralsList = numeralsOfNumber(i);
            int k = numeralsList.size();
            int newNumber = 0;
            for (int j = 0; j < numeralsList.size(); j++) {
                newNumber = newNumber + (int) Math.pow(numeralsList.get(j), k);
            }
            if (i == newNumber) {
                System.out.println(i);
            }
        }
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
